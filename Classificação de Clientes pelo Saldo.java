import java.util.Scanner;

public class B {
    public static void main(String[] a) {
        double s = new Scanner(System.in).nextDouble();
        System.out.println(s < 0 ? "Negativado" : s <= 500 ? "Baixo" : "Confortavel");
    }
}
