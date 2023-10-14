package Java_Karisik_Problemler;

import java.util.Scanner;

public class a07_soru {
    public static void main(String[] args) {


        //Soru 4 : Main method'da kullanicidan sifre isteyip,
        //          olusturacagimiz bir method'da asagidaki sartlari kontrol edin
        //          ve method'dan true veya false dondurun
        //         ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        //         tum sartlari saglanincaya kadar tekrar deger isteyin
        //         ve sartlar saglaninca , "sifre basariyla kaydedildi" yazdirin
        //         - ilk harf kucuk harf olmali
        //         - son karakter rakam olmali
        //         - sifre bosluk icermemeli
        //         - uzunlugu en az 10 karakter olmali



        Scanner scanner=new Scanner(System.in);
        String sifre=scanner.nextLine();
        boolean sonuc=false;
        while(!sonuc){
            while (!sonuc){ // sonuc == false  isleminin sonucu
                scanner = new Scanner(System.in);
                System.out.println("Lutfen sifrenizi giriniz");
                sifre = scanner.nextLine();
                sonuc = sifreKontrolEt(sifre);
            }

            System.out.println("Sifreniz basariyla kaydedildi");


        }


    } public static boolean sifreKontrolEt(String sifre) {
        int sayac = 00;
        char ilkHarf = sifre.charAt(0);
        if (!(ilkHarf >= 'a' && ilkHarf <= 'z')) {
            System.out.println("Sifrenizi büyük harf olmali ");
        }
        char sonKarekter = sifre.charAt(sifre.length() - 1);
        if (!(sonKarekter >= 1 && sonKarekter <= 9)) {
            System.out.println("Son karekter rakam olmali");
            sayac++;
        }
        if (sifre.contains("")) {
            System.out.println("sifre bosluk icermemeli");
            sayac++;
        }
        if (sifre.length() < 10) {
            System.out.println("Sifre en az 10 karekter olmalidir");
            sayac++;

        }
        if (sayac == 0) {
            return true;
        } else {
            return false;
        }

    }}








