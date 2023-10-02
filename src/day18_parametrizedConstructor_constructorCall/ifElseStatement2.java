package day18_parametrizedConstructor_constructorCall;

import java.util.Scanner;

public class ifElseStatement2 {
    public static void main(String[] args) {
      //Kullanicidan cinsiyetini ve yasini alin ,kadin 60 yas
        // uzeri ,Erkek   65 yas ve uzeri emekli olabilir .Cinsiyet ve yasini  dikkate alarak "Emekli olabilirsin"
        //ve "Emekli olmak icin .. yil daha calisman gerekiyor" yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi girinizi 'E' veya 'K' olarak giriniz");
        char cinsiyet=scanner.next().charAt(0);
        System.out.println("Lutfen yasinizi giriniz");
        int yas=scanner.nextInt();
        if( cinsiyet == 'K' || cinsiyet=='k' && yas>=60){
            System.out.println("Emeklisiniz"); }
            if(cinsiyet== 'K'|| cinsiyet ==  'k' && yas<60){
                System.out.println("Emekli olmaniz icin " + (60 - yas )+ " kadar daha yil calismaniz gerekiyor ");}
                if(cinsiyet =='E' || cinsiyet =='e' && yas>=65){
                    System.out.println("Emeklisiniz");

                }
                if(cinsiyet == 'E'|| cinsiyet == 'e'&& yas<65){
                    System.out.println("Emekli olmaniz icin " + (65 - yas) + " kadar daha yil calismaniz gerekiyor");
                }
                else {
                    System.out.println("Yanlis bir deger girdiniz");
                }
            }





}
