
import java.util.ArrayList;
import java.util.List;

public class Nomor5 {

    public static List<Integer> searchIndex(int[] array, int target) {
        List<Integer> indices = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                indices.add(i);
            }
        }

        return indices;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 8, 2, 5, 9, 5, 3};
        int targetNumber = 5;

        List<Integer> result = searchIndex(numbers, targetNumber);

        if (result.isEmpty()) {
            System.out.println("Angka tidak ditemukan dalam array.");
        } else {
            System.out.println("Angka ditemukan pada indeks: " + result);
        }
    }
}
