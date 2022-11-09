import java.util.Scanner;
class Naloga12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i = 0;
        int j = 0;
        int k = 1;
        for(; i < a ; i++) {
            for(; j < a - i - 1; j++) {
                System.out.print(" ");
            }
            j = 0;
            for(; k <= 2 * i + 1; k++) {
                System.out.print("*");
            }
            k = 1;
            System.out.println();
        }
    }
}
