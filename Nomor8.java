import java.util.ArrayList;
import java.util.List;

public class Nomor8 {
    public static void main(String[] args) {
        String[] texts = {"Hello", "World", "Java", "Programming", "Language"};

        // Memanggil metode searchText dengan range panjang 4-6
        List<Integer> searchResult = searchText(texts, 4, 6);

        // Menampilkan hasil pencarian
        if (searchResult.isEmpty()) {
            System.out.println("Teks tidak ditemukan.");
        } else {
            System.out.println("Teks ditemukan pada indeks: " + searchResult);
        }
    }

    public static List<Integer> searchText(String[] texts, int minLength, int maxLength) {
        List<Integer> indices = new ArrayList<>();

        for (int i = 0; i < texts.length; i++) {
            String text = texts[i];

            if (text.length() >= minLength && text.length() <= maxLength) {
                indices.add(i);
            }
        }

        return indices;
    }
}
