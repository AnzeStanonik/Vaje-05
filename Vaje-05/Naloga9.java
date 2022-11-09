import java.util.Scanner;
class Naloga9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = a;
        int i = 0;
        int d = a;
        for(; a > 0; i++) {
            a /= 10;
            int c = d - a * 10;
            d /= 10;
            System.out.println(c);
        }
        System.out.println("---");
        System.out.println("Vhodno stevilo: " + b);
        System.out.println("Stevilo stevk: " + i);
        
    }
}
