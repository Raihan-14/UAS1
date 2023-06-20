import java.util.Scanner;

public class Nomor3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;

        System.out.println("Masukkan 10 angka:");
        for (int i = 0; i < 10; i++) {
            int number = input.nextInt();
            if (number % 5 == 0) {
                count++;
            }
        }

        System.out.println("Banyak angka kelipatan 5: " + count);
    }
}
