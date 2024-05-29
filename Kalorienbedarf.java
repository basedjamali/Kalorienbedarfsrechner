import java.util.Scanner;

public class Kalorienbedarf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Willkommensgruesse
        System.out.println("=== Willkommen bei HealthyEats, dem besten Kalorienbedarfsrechner! ===");

        // Eingabe des Namens
        System.out.println("Zum Start, bitte geben Sie ihren Namen:");
        String name = scanner.nextLine();

        System.out.println("\nHallo " + name
                + ", mit unserem Programm koennen Sie berechnen, wie viel Kalorien Sie taeglich brauchen, um fit zu bleiben.\n");
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

        // Groesse
        double groesse = 0;
        while (true) {
            System.out.println("3. Wie gross sind Sie [in cm]:");
            groesse = scanner.nextDouble();

            if (groesse <= 0) {
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

        // Aktivitaetslevel
        double aktivitaetsfaktor = 0;
        while (true) {
            System.out.println("5. Waehlen Sie Ihr Aktivitaetslevel:");
            System.out.println("   [1. Kaum oder keine Bewegung]");
            System.out.println("   [2. Leichte Bewegung (Sport 1-3 Tage/Woche)]");
            System.out.println("   [3. Maessige Bewegung (Sport 3-5 Tage/Woche)]");
            System.out.println("   [4. Starke Bewegung (Sport 6-7 Tage/Woche)]");
            System.out.println("   [5. Sehr starke Bewegung (hartes Training, koerperlich anstrengender Beruf)]");
            int aktivitaet = scanner.nextInt();

            if (aktivitaet >= 1 && aktivitaet <= 5) {
                if (aktivitaet == 1) {
                    aktivitaetsfaktor = 1.2;
                } else if (aktivitaet == 2) {
                    aktivitaetsfaktor = 1.375;
                } else if (aktivitaet == 3) {
                    aktivitaetsfaktor = 1.55;
                } else if (aktivitaet == 4) {
                    aktivitaetsfaktor = 1.725;
                } else if (aktivitaet == 5) {
                    aktivitaetsfaktor = 1.9;
                }
                break;
            } else {
                System.out.println("Die Eingabe ist falsch. Versuchen Sie es erneut!");
            }
        }

        // Harris-Bennedict-Formel
        if (geschlecht.equals("m")) {
            double kalorienbedarfMann = 66.47 + ((13.7 * gewicht) + (5 * groesse) - (6.8 * alter)) * aktivitaetsfaktor;
            System.out.println("\nIhr taeglicher Kalorienbedarf betraegt: " + kalorienbedarfMann + " kcal\n");
        } else if (geschlecht.equals("w")) {
            double kalorienbedarfFrau = 655.1 + ((9.6 * gewicht) + (1.8 * groesse) - (4.7 * alter)) * aktivitaetsfaktor;
            System.out.println("\nIhr taeglicher Kalorienbedarf betraegt: " + kalorienbedarfFrau + " kcal\n");
        }

        System.out.println("Danke fuer Ihre Anmeldung und bleiben Sie gesund!");
    }
}
