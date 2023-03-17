import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //zadanie1();
        //zadanie2();
        //zadanie3();
        //zadanie4();
        //zadanie5();
        //zadanie6();
        //zadanie7();
        //zadanie8();
        //zadanie9();
        //zadanie10();
        //zadanie11();
        //zadanie12();
        zadanie13();

    }

    public static void zadanie1() {
        Scanner input = new Scanner(System.in);
        float a = input.nextFloat();
        float b = input.nextFloat();
        System.out.println(a * b);
    }

    public static void zadanie2() {
        System.out.println(String.format("%.2f", Math.sqrt(Math.PI)));
    }

    public static void zadanie3() {
        Scanner input = new Scanner(System.in);
        String string1 = input.next();
        String string2 = input.next();
        System.out.println("%" + string2 + " " + string1 + "%");
    }

    public static void zadanie4() {
        Scanner input = new Scanner(System.in);
        float a = input.nextFloat();
        float b = input.nextFloat();
        float c = input.nextFloat();

        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("BŁĄD");
        } else if (a + b > c && a + c > b && b + c > a) {
            System.out.println("TAK");
        } else {
            System.out.println("NIE");
        }
    }

    public static void zadanie5() {
        Scanner input = new Scanner(System.in);
        int month = input.nextInt();

        switch (month) {
            case 1:
                System.out.println("Styczeń: 31 dni");
                break;
            case 2:
                System.out.println("Luty: 28 dni");
                break;
            case 3:
                System.out.println("Marzec: 31 dni");
                break;
            case 4:
                System.out.println("Kwiecień: 30 dni");
                break;
            case 5:
                System.out.println("Maj: 31 dni");
                break;
            case 6:
                System.out.println("Czerwiec: 30 dni");
                break;
            case 7:
                System.out.println("Lipiec: 31 dni");
                break;
            case 8:
                System.out.println("Sierpień: 31 dni");
                break;
            case 9:
                System.out.println("Wrzesień: 30 dni");
                break;
            case 10:
                System.out.println("Październik: 31 dni");
                break;
            case 11:
                System.out.println("Listopad: 30 dni");
                break;
            case 12:
                System.out.println("Grudzień: 31 dni");
                break;
            default:
                System.out.println("BŁĄD");
        }
    }

    public static void zadanie6() {
        Scanner input = new Scanner(System.in);
        float a = input.nextFloat();
        float b = input.nextFloat();
        float c = input.nextFloat();

        //od najmniejszej do najwiekszej
        if (a < b && a < c) {
            System.out.print(a + " ");
        } else if (b < c && b < a) {
            System.out.print(b + " ");
        } else {
            System.out.print(c + " ");
        }

        if ((a > b && a < c) || (a < b && a > c)) {
            System.out.print(a + " ");
        } else if ((b > a && b < c) || (b < a && b > c)) {
            System.out.print(b + " ");
        } else {
            System.out.print(c + " ");
        }

        if (a > b && a > c) {
            System.out.println(a);
        } else if (b > c && b > a) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }

        //od najwiekszej do najmniejszej

        if (a > b && a > c) {
            System.out.print(a + " ");
        } else if (b > c && b > a) {
            System.out.print(b + " ");
        } else {
            System.out.print(c + " ");
        }

        if ((a > b && a < c) || (a < b && a > c)) {
            System.out.print(a + " ");
        } else if ((b > a && b < c) || (b < a && b > c)) {
            System.out.print(b + " ");
        } else {
            System.out.print(c + " ");
        }

        if (a < b && a < c) {
            System.out.print(a);
        } else if (b < c && b < a) {
            System.out.print(b);
        } else {
            System.out.print(c);
        }
    }

    public static void zadanie7() {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();

        if (!(n == m)) {
            System.out.println("BŁĄD");
        } else {
            int sum = 0;
            int[] arrayN = new int[n];
            int[] arrayM = new int[m];

            for (int i = 0; i < n; i++) {
                arrayN[i] = input.nextInt();
            }

            for (int i = 0; i < m; i++) {
                arrayM[i] = input.nextInt();
            }

            for (int i = 0; i < n; i++) {
                sum += arrayN[i] * arrayM[i];
            }

            System.out.println(sum);
        }
    }

    public static void zadanie8() {

        Scanner input = new Scanner(System.in);
        int n = 0;

        //walidacja wejscia
        do {
            while (!input.hasNextInt()) {
                input.next();
            }
            n = input.nextInt();
        } while (n <= 0);

        String stars = "";
        String starsMax = "";

        for (int i = 0; i < n; i++) {
            stars += "*";
            System.out.print(stars + "\n");
        }

        System.out.print(stars + "\n");
        starsMax = stars;

        for (int i = n; i > 1; i--) {
            stars = stars.substring(0, stars.length() - 1);
            System.out.print(stars + "\n");
        }

        stars = starsMax;

        System.out.print(stars + "\n");

        for (int i = 1; i < n; i++) {
            stars = stars.replaceFirst("\\*", " ");
            System.out.print(stars + "\n");
        }

        for (int i = 0; i < n; i++) {
            stars = stars.substring(0, stars.length() - i - 1) + "*" + stars.substring(stars.length() - i);
            System.out.print(stars + "\n");
        }
    }

    public static void zadanie9() {

        Scanner input = new Scanner(System.in);
        String napis = input.next();
        char[] napisChar = new char[100];
        napisChar = napis.toCharArray();

        if (palindrom(napisChar)) {
            System.out.println("TAK");
        } else {
            System.out.println("NIE");
        }

    }

    public static boolean palindrom(char[] string) {

        for (int i = 1; i < string.length; i++) {
            if (!(string[i - 1] == string[(string.length - i)])) {
                return false;
            }
        }

        return true;
    }

    public static void zadanie10() {

        Scanner input = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int value = 0;

        //walidacja wejscia

        if (!input.hasNextInt()) {
            System.out.println("BŁĄD");
            System.exit(0);
        } else {
            a = input.nextInt();
            if (a <= 0) {
                System.out.println("BŁĄD");
                System.exit(0);
            }
        }

        if (!input.hasNextInt()) {
            System.out.println("BŁĄD");
            System.exit(0);
        } else {
            b = input.nextInt();
            if (b <= 0) {
                System.out.println("BŁĄD");
                System.exit(0);
            }
        }

        //inicjalizowanie tablicy

        int[][] array = new int[a][b];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {

                //walidacja wejscia

                if (!input.hasNextInt()) {
                    System.out.println("BŁĄD");
                    System.exit(0);
                } else {
                    array[i][j] = input.nextInt();
                }
            }
        }

        for (int j = 0; j < b; j++) {
            for (int i = 0; i < a; i++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public static void zadanie11() {

        Scanner input = new Scanner(System.in);
        String string = input.nextLine();

        if (pangram(string)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static boolean pangram(String napis) {

        napis = napis.toLowerCase();

        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (!(napis.contains(napis.valueOf(ch)))) {
                return false;
            }
        }

        return true;
    }

    public static void zadanie12() {

        double planetaWiek = 0;
        Scanner input = new Scanner(System.in);
        int sekundy = input.nextInt();
        String planeta = input.next();

        switch (planeta) {
            case "Ziemia":
                planetaWiek = 1.00;
                System.out.println(wiek(sekundy, planetaWiek));
                break;
            case "Merkury":
                planetaWiek = 0.2408467;
                System.out.println(wiek(sekundy, planetaWiek));
                break;
            case "Wenus":
                planetaWiek = 0.61519726;
                System.out.println(wiek(sekundy, planetaWiek));
                break;
            case "Mars":
                planetaWiek = 1.8808158;
                System.out.println(wiek(sekundy, planetaWiek));
                break;
            case "Jowisz":
                planetaWiek = 11.862615;
                System.out.println(wiek(sekundy, planetaWiek));
                break;
            case "Saturn":
                planetaWiek = 29.447498;
                System.out.println(wiek(sekundy, planetaWiek));
                break;
            case "Uran":
                planetaWiek = 84.016846;
                System.out.println(wiek(sekundy, planetaWiek));
                break;
            case "Neptun":
                planetaWiek = 164.79132;
                System.out.println(wiek(sekundy, planetaWiek));
                break;
            default:
                System.out.println("Nieprawidłowa nazwa planety.");

        }

    }

    public static double wiek(double sekundy, double planeta) {

        double ziemia = 31557600;
        double wiek = Math.round(((sekundy / ziemia) * planeta) * 100.0) / 100.0;


        return wiek;
    }

    public static void zadanie13() {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }

        System.out.println(arrayMaxValue(array, 0, 0));

    }

    //funkcja rekurencyjna zwracajaca najwieksza wartosc elementu w tablicy, wartosci zmiennych index i maxValue
    //w wywolaniu musza miec wartosc 0 i 0
    public static int arrayMaxValue(int[] array, int index, int maxValue) {

        if ((index >= 0) && (index < array.length) && (maxValue < array[index])) {
                maxValue = array[index];
                return arrayMaxValue(array, index + 1, maxValue);
        } else {
            return maxValue;
        }
    }

}































