import java.util.Scanner;
class Naloga8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = a;
        int i = 0;
        for(; a > 0; i++) {
            a /= 10;
        }
        System.out.println("Vhodno stevilo: " + b);
        System.out.println("Stevilo stevk: " + i);
        
    }
}