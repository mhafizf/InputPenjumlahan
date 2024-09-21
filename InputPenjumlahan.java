import java.util.Scanner;

public class InputPenjumlahan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int angka1, angka2, hasil;

        System.out.print("Bilangan1");
        angka1 = in.nextInt();
        System.out.println("Bilangan2");
        angka2 = in.nextInt();

        hasil = angka1 + angka2; 

    }
}
