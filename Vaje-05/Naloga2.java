import java.util.Scanner;
class Naloga2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int j = 0;
        for(int i = 1; i <= a; i++) {
            j += i;
            if(a < 10 || a > 1000) {
                System.out.println("Opozorilo, napaka!");
                break;
            }
            if(a == i) {
            System.out.println("Rezultat: " + j);
            }
        }
    }
}
