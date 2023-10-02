import java.util.Scanner;

public class dataCasting {
    public static void main(String[] args) {

        //Double olarak verilen 3 sayinin toplamini int olarak yazdirin
        //ipucu: double>float>long>int>short>byte

double a=3 ,b =7 ,c=3.12;
int toplam=(int)(a+b+c);
        System.out.println("toplam =" + toplam);

        /* Kullanicidan bir harf girmesini isteyiniz.
        Girdiginiz harf :
        Girdiginiz harften bir sonraki 3 harf :
        ipucu: char
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
       char harf=scanner.next().charAt(0);
        System.out.println("Girdiginiz harf : " + harf);
        System.out.println(  "Girdiginiz harften sonraki uc harf : " + (char)(harf+1)  +"  " +  (char)(harf+2) + " "+ (char)(harf+3));

    }
}
