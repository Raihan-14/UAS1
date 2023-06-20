import java.util.Scanner;

public class Nomor6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Memasukkan teks yang ingin dicari
        System.out.print("Masukkan teks yang ingin dicari: ");
        String searchText = scanner.nextLine();

        // Array contoh
        String[] dataArray = {"apel", "jeruk", "mangga", "pisang", "mangga"};

        // Memanggil metode searchArray untuk mencari teks dan mendapatkan indeksnya
        int[] searchResults = searchArray(dataArray, searchText);

        if (searchResults.length > 0) {
            System.out.println("Teks ditemukan pada indeks berikut:");
            for (int index : searchResults) {
                System.out.println(index);
            }
        } else {
            System.out.println("Teks tidak ditemukan dalam array.");
        }
    }

    // Metode untuk mencari teks dalam array dan mengembalikan indeksnya
    public static int[] searchArray(String[] array, String searchText) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(searchText)) {
                count++;
            }
        }

        int[] indices = new int[count];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(searchText)) {
                indices[index] = i;
                index++;
            }
        }

        return indices;
    }
}
