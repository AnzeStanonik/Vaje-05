import java.util.Scanner;
class Naloga3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
   /*  int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    int e = sc.nextInt();
    int f = sc.nextInt();
    int g = sc.nextInt();
    int h = sc.nextInt();
    int i = sc.nextInt();
    int j = sc.nextInt(); */
   // int zmnozek = a * b * c * d * e * f *g * h * i * j;
   // float sestevek = (a + b + c + d + e + f + g + h + i + j);
   int i = 0;
   int j = 1;
   int a;
   float k = 0;
   do {
    a = sc.nextInt();
    j *= a;
    k += a;
    i++;
   } while(i < 10); 
    float povprecje = k / 10;
    System.out.println("Zmnozek: " + j);
    System.out.println("Povprecje: " + povprecje);
    }
}
