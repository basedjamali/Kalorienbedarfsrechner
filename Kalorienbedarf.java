import java.util.Scanner;

public class Kalorienbedarf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Willkommensgrüße
        System.out.println("=== Willkommen bei HealthyEats, dem besten Kalorienbedarfsrechner! ===");

        // Eingabe des Namens
        System.out.println("Zum Start, bitte geben Sie ihren Namen:");
        String name = scanner.nextLine();

        System.out.println("\nHallo " + name
                + ", mit unserem Programm können Sie berechnen, wie viel Kalorien Sie täglich brauchen, um fit zu bleiben.\n");
        System.out.println("Starten wir nun mit der Berechnung!");

        // Geschlecht
        String geschlecht;
        while (true) {
            System.out.println("1. Geben Sie ihr Geschlecht an [m/w]:");
            geschlecht = scanner.nextLine();

            if (geschlecht.equals("m") || geschlecht.equals("w")) {
                break;
            } else {
                System.out.println("Die Eingabe ist falsch. Versuchen Sie es erneut!");
            }
        }

        // Alter
        int alter = 0;
        while (true) {
            System.out.println("2. Wie alt sind Sie:");
            alter = scanner.nextInt();

            if (alter > 0) {
                break;
            } else {
                System.out.println("Die Eingabe ist falsch. Versuchen Sie es erneut!");
            }
        }

        // Größe
        double größe = 0;
        while (true) {
            System.out.println("3. Wie groß sind Sie [in cm]:");
            größe = scanner.nextDouble();

            if (größe <= 0) {
                System.out.println("Die Eingabe ist falsch. Versuchen Sie es erneut!");
            } else {
                break;
            }
        }

        // Gewicht
        double gewicht = 0;
        while (true) {
            System.out.println("4. Wie viel wiegen Sie [in kg]:");
            gewicht = scanner.nextDouble();

            if (gewicht <= 0) {
                System.out.println("Die Eingabe ist falsch. Versuchen Sie es erneut!");
            } else {
                break;
            }
        }

        // Aktivitätslevel
        double aktivitätsfaktor = 0;
        while (true) {
            System.out.println("5. Wählen Sie Ihr Aktivitätslevel:");
            System.out.println("   [1. Kaum oder keine Bewegung]");
            System.out.println("   [2. Leichte Bewegung (Sport 1-3 Tage/Woche)]");
            System.out.println("   [3. Mäßige Bewegung (Sport 3-5 Tage/Woche)]");
            System.out.println("   [4. Starke Bewegung (Sport 6-7 Tage/Woche)]");
            System.out.println("   [5. Sehr starke Bewegung (hartes Training, körperlich anstrengender Beruf)]");
            int aktivität = scanner.nextInt();

            if (aktivität >= 1 && aktivität <= 5) {
                if (aktivität == 1) {
                    aktivitätsfaktor = 1.2;
                } else if (aktivität == 2) {
                    aktivitätsfaktor = 1.375;
                } else if (aktivität == 3) {
                    aktivitätsfaktor = 1.55;
                } else if (aktivität == 4) {
                    aktivitätsfaktor = 1.725;
                } else if (aktivität == 5) {
                    aktivitätsfaktor = 1.9;
                }
                break;
            } else {
                System.out.println("Die Eingabe ist falsch. Versuchen Sie es erneut!");
            }
        }

        // Harris-Bennedict-Formel
        if (geschlecht.equals("m")) {
            double kalorienbedarfMann = 66.47 + ((13.7 * gewicht) + (5 * größe) - (6.8 * alter)) * aktivitätsfaktor;
            System.out.println("\nIhr täglicher Kalorienbedarf beträgt: " + kalorienbedarfMann + " kcal\n");
        } else if (geschlecht.equals("w")) {
            double kalorienbedarfFrau = 655.1 + ((9.6 * gewicht) + (1.8 * größe) - (4.7 * alter)) * aktivitätsfaktor;
            System.out.println("\nIhr täglicher Kalorienbedarf beträgt: " + kalorienbedarfFrau + " kcal\n");
        }

        System.out.println("Danke für Ihre Anmeldung und bleiben Sie gesund!");
    }
}
