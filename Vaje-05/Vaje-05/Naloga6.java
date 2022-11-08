import java.util.Scanner;
class Naloga6 {
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    a++;
    if(a >= b) {
        System.out.println("Napaka pri vnosu podatkov.");
    }
    {for(; a < b; a++) {
        String c = " ni";
        if(a % 4 == 0 && (a % 100 != 0 || a  % 400 == 0)) {
            c = " je";
        }else {
            c = " ni";
        }
        System.out.println("Leto " + a + c + " prestopno leto.");
    }
    }}
}
