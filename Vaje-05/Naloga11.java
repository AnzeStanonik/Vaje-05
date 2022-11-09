import java.util.Scanner;
class Naloga11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int p = 0;
        if(n >= m || n == 0) {
            System.out.println("Napacen vnos podatkov.");
            System.exit(p);
        }
        int i = 1;
        int a = 1;
        int z = 1;
        int k = n;
        int g = n;
        for(; n <= m; n++) {
            k = n;
            int j = i;
            i = 1;
            for(; k != 1; i++) {
                if(k % 2 == 0) {
                k /= 2;
                } else {
                k *= 3;
                k += 1;
                }
            }
            if(j < i) {
                z = n;
                a = i;
            }
        }
        System.out.println("Stevilo z najdaljsim zaporedjem med " + g + " in " + m + " je: " + z);
        System.out.println("Stevilo clenov zaporedja stevila " + z + ": " + a);
    }
}