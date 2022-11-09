import java.util.Scanner;
class Naloga10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Vhodno stevilo: " + n);
        int i = 1;
        for(; n != 1; i++) {
            if(n % 2 == 0) {
                n /= 2;
            } else {
                n *= 3;
                n += 1; 
            }
        }
        System.out.println("Stevilo clenov v Collatzovem zaporedju: " + i);
    }
}