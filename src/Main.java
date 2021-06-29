import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner alanhESAPLA = new Scanner(System.in);

        int kenar1,kenar2,kenar3;
        int u;
        int alan;

        System.out.print("1. Kenarı giriniz: ");
        kenar1 = alanhESAPLA.nextInt();
        System.out.print("2. Kenarı giriniz: ");
        kenar2 = alanhESAPLA.nextInt();
        System.out.print("3. Kenarı giriniz: ");
        kenar3 = alanhESAPLA.nextInt();

        u = (kenar1 + kenar2 + kenar3) / 2;
        alan = (int) Math.sqrt(u * (u - kenar1) * (u - kenar2) * (u - kenar3));
        System.out.println("Üçgenin alanı = " + alan);

    }
}
