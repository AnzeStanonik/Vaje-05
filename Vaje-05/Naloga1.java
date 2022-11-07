class Naloga1 {
    public static void main(String[] args) {
        int i = 1;
        while(i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        int f = 1;
        int g;
        int h = 0;
        int a;
        System.out.println("");
         while(f <= 9) {
             f++;
             g = f * 2 - 2;
             a = g;
            while(h < g) {
                System.out.print(" ");
                h++;
                a--;
            }
            a++;
            while(h >= a){
                    h--;
                }
            System.out.println(f);
        }
    }
}