import java.util.Scanner;
class Naloga15 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = a;
        for(int i = 1 ; i <= a ; i++) {
            if(b % i != 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}

