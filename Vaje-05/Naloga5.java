import java.util.Scanner;
class Naloga5 {
    public static void main (String[] args ) {
        Scanner sc = new Scanner(System.in);
        int a = 1;
        for(int i = 0; i == 0; a++) {
            String c = sc.next();
           // if(c == "konec") {
            if(c.equals("konec")) { // ok
                break;
            }
           // System.out.println(new String(c[0]));
        }
        System.out.println("Stevilo ponovitev vnosa: " + a);
    }
}
