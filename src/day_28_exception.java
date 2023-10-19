import com.sun.source.tree.WhileLoopTree;

import java.util.InputMismatchException;
import java.util.Scanner;

public class day_28_exception {
    public static void main(String[] args) {

// kullanicidan toplanmak uzere sayilar isteyin
        // kullanici islemi bitirmek icin Q'ya basmalidir
        // kullanici Q'ya bastiginda,
        // kac sayi girildigini ve toplamin ne oldugunu yazdirin

       Scanner scanner=new Scanner(System.in);
       double girilenSayi=0;
       double toplam=0;
       int sayac=0;
       boolean devamEdelimmi=true;
       while(devamEdelimmi){
           System.out.println("Lutfen toplanmak uzere sayilar giriniz \n Cikmak icin Q ' ye basiniz");
           try {
               girilenSayi=scanner.nextDouble();
               toplam+=girilenSayi;
               sayac++;
           } catch (InputMismatchException e) {
               String sayiOlmayan=scanner.nextLine();
               if(sayiOlmayan.equalsIgnoreCase("Q")) {
                   devamEdelimmi=false;

           }else {
                   System.out.println("Hatali giris yaptiniz lutfen sayi giriniz");
               }


       }

        }

        System.out.println(sayac + " adet sayinin toplami : "  + toplam);







    }
}
