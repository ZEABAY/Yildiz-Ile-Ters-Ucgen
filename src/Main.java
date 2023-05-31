import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Kaç katlı üçgen çizilecek
        System.out.print("Kat : ");
        int level = scan.nextInt();

        for (int i = 1; i <= level; i++) {
            //Boşlukları yaz
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            //Yıldızları yaz
            for (int j = 1; j <= 2 * (level - i) + 1; j++) {
                System.out.print("*");
            }

            System.out.println("");
        }
    }
}
