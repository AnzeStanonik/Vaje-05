import java.util.Scanner;
class Naloga2{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stevilo = sc.nextInt();
        if(stevilo < 10 || stevilo > 1000) {
            System.out.println("Napaka, prosimo napisite stevilo od 10 do 1000");
        }
        int stevec = 0;
        int a = 0;
        int b = 0;
            while (stevec < stevilo) {
            a += stevec++;
        }
        b = stevec + a;
        System.out.println(b);
    }
}
