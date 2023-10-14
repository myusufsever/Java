package Java_Karisik_Problemler;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class a08_soru {
    // Kullanicidan toplanmak uzere sayilar alin
    // girilen sayilarin toplami 500'u gecerse
    // bu kadar sayi yeter, girilen sayilarin toplami .... oldu yazdirin
    // girilen sayi adedi 10 veya daha yuksek olursa
    // 10'dan fazla sayi giremezsin, girilen sayilarin toplami .... oldu yazdirin
    // ve islemi bitirin

    public static void main(String[] args) {


      Scanner scanner=new Scanner(System.in);
        int sayi;
        int toplam=0;
        int sayac=0;
        while(toplam<500 && sayac<=10){
            Scanner scanner1=new Scanner(System.in);
            System.out.println("Lutfen toplanmak uzere sayi giriniz");
        sayi=scanner.nextInt();

            toplam += sayi;

            }

        if(toplam>500){
            System.out.println("Bu kadar sayi yeter , girilen sayilarin toplami " + toplam + "oldu");
            if(sayac>10){
                System.out.println("10'dan fazla sayi girimezsin girilen sayilarin " + toplam + " oldu ");
            }





        }






    }
}
