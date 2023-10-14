package Java_Karisik_Problemler;

import javax.naming.BinaryRefAddr;
import java.util.Scanner;

public class a09_soru {
    public static void main(String[] args) {

        //Soru 2- While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen basmak rakamlar toplamini bulmak istediginiz sayiyi giriniz");
        int girilensayi=scanner.nextInt();

        int sayi=girilensayi;
        int toplam=0;
        int birlerbasamagi=0;
        while(sayi>0){
            birlerbasamagi = sayi%10;
            toplam += birlerbasamagi;
            sayi /= 10;

        }
        System.out.println("girilen " + girilensayi + "'nin rakanlar toplami : " + toplam);
    }
}
