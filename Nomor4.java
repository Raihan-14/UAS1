import java.util.Scanner;

public class Nomor4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        System.out.println("Masukkan 10 teks:");
        for (int i = 1; i <= 10; i++) {
            String input = scanner.nextLine();
            if (input.length() == 5) {
                count++;
            }
        }

        System.out.println("Jumlah teks dengan panjang 5 karakter: " + count);
    }
}
