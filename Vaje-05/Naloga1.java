import java.util.Scanner;
class Naloga1{
    public static void main(String[] args){
        int stevec = 1;
        while (stevec < 11) {
            System.out.print(stevec + " ");
            stevec++;
        }   
        System.out.println();
        stevec = 2;
        int stevec_presledkov = (stevec*2);
        while (stevec < 11) {
            System.out.println(stevec); 
            stevec++;
        }
    }
}