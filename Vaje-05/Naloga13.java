import java.util.Scanner;
class Naloga13 {
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();
    int d = sc.nextInt();
    int i = 0;
    for(int a = 1; a < 10 ; a++ , a++) {
        for(int b = m + 1 ; b < 10 ; b++) {
            for(int c = 0; c < 10 ;) {
                System.out.println(a + "-" + b + "-" + c);
                c += d;
                i++;
            }
        }
    }
    System.out.println(i);
    }
}
