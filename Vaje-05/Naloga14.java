import java.util.Scanner;
class Naloga14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = 0;
        int i = 0;
        for(; i < 10 ; i++) {
            int a = sc.nextInt();
            b += a;
            if(a == 0 || b >= 100) {
                if(a > 0) {
                    i++;
                }
                break;
            }
        }
        System.out.println("V kosarico ste dodala " + i + " artikla, ki skupaj znasata " + b + " enot.");
    }
}
