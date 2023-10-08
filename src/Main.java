import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int value1;
        int value2;
        double value3;

        System.out.print("1. Kenarı Giriniz: ");
        value1 = scan.nextInt();

        System.out.print("1. Kenarı Giriniz: ");
        value2 = scan.nextInt();

        value3 = Math.sqrt((value1*value1)+(value2*value2));

        System.out.println("1. Kenar: " + value1);
        System.out.println("2. Kenar: " + value2);
        System.out.println("Hipotenüs: " + value3);
    }
}