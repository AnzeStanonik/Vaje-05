import java.util.Scanner;
class Naloga11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println("Vhodno stevilo: " + n);
        int i = 1;
        int z = 0;
        int k = n;
        int g = n;
        for(; n < m; n++) {
            int j = k;
            for(; k != 1; i++) {
                if(k % 2 == 0) {
                k /= 2;
                } else {
                k *= 3;
                k += 1;
                }
                if(i < j) {
                    z = j;
                }
            }

        }
        System.out.println("Stevilo z najdaljsim zaporedjem med " + g + " in " + m + " je: " + z);
        System.out.println("Stevilo clenov zaporedja stevila" + z + ": " + i);
    }
}