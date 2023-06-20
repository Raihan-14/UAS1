import java.util.Scanner;

class Mein {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = scanner.nextInt();

        if (angka % 5 == 0) {
            System.out.println(angka + " adalah kelipatan 5.");
        } else {
            System.out.println(angka + " bukan kelipatan 5.");
        }
    }
}
