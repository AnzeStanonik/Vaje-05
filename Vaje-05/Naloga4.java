import java.util.Scanner;
class Naloga4 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int j = 0;
    for(int i = 0; i < a; i++) {
        if(a <= 3) {
            System.out.println("Naka pri vnosu podatka!");
            break;
            }
        for(; j <= i; j++) {
            System.out.print("*");
            }
        for(; j > 0; j--) {        
        }
        System.out.println("");
        }
    }    
}

