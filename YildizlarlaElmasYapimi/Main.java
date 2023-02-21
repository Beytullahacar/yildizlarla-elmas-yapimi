package YildizlarlaElmasYapimi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int n = scan.nextInt();
        int j = 0;

        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }
            for (j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        j -=1;
        for (int i = 1; i <= (n - 1); i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print(" ");
            }
            j-=2;
            for (int m = 1; m <= j; m++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
