import java.util.ArrayList;
import java.util.Collections;

public class Nomor10 {

    public static ArrayList<Integer> cariKelipatanLima(int batas) {
        ArrayList<Integer> hasil = new ArrayList<>();

        for (int i = 1; i <= batas; i++) {
            if (i % 5 == 0) {
                hasil.add(i);
            }
        }

        return hasil;
    }

    public static void main(String[] args) {
        int batas = 50;
        ArrayList<Integer> kelipatanLima = cariKelipatanLima(batas);

        Collections.sort(kelipatanLima);

        System.out.println("Angka-angka kelipatan 5 dari 1 hingga " + batas + " adalah:");
        for (int angka : kelipatanLima) {
            System.out.print(angka + " ");
        }
    }
}
