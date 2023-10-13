package Wise_T127_MARKET;

import java.util.Scanner;

public class Wise_T127_MARKET {

    /*
   *
  ====================WISE T127 MARKET===================================
ilk programa girildiginde bizi bir menu karsilasin bu secenekler
  1 ŞARKÜTERİ ÜRÜNLERİ
  2 MANAV ÜRÜNLERİ
  3 MARKET
  secime gore ,
  4-urunleri listele ve
  5-fiyatlari gelsin
  6-sonunda fis yazdırsın
    */


    static Scanner scanner = new Scanner(System.in);
    static String urunAdi="";
    static int urunKodu;
    static double urunfiyat;
    static int urunMiktari;
static  double toplam;
static String sepet="";

static boolean ekUrun=false;

    public static void main(String[] args) {
        girisekrani();

    }public static void girisekrani(){

        System.out.println("===================== WİSE T 127 MARKET PLACE ========================");
        System.out.println("============================ H O S G EL D İ N İ Z ==============================");
        System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz!");
        System.out.println("Manav Ürünleri için 1\nŞarküteri Ürünleri İcin 2\nMarket Ürünleri İcin 3\nFis Yazdirmak İcin 4\nÇıkış yapmak icin 5 ");
int secim=scanner.nextInt();
 if( !(secim>=1 && secim<=5)){
     System.out.println("Yanlış bir giriş yaptınız. Tekrar deneyiniz!");
     girisekrani();
 }else{
     switch (secim){
         case 1:
  manav();
  break;
         case 2:
             sarkuteri();
             break;
         case 3:
             market();
             break;
         case 4:
             fisyazdir();
             break;
         case 5:
             cikis();
             break;


     }

 }

    }
    public static void manav(){

        System.out.println("-----------Manav Reyonuna Hoşgeldiniz-----------");
        System.out.println("----------Almak isteginiz urunun kodunu giriniz(uk) ----------");

        System.out.println(" ELMA FİYATİ : 25₺ UK:11\n MUZ FİYATİ : 40 ₺ UK:12 \n Domates Fiyatı : 20 ₺ UK:13 \n Çilek fiyati :100 ₺ UK :15 ");
urunKodu=scanner.nextInt();
        while (!ekUrun){

    if(urunKodu>=11 && urunKodu<=15 ){

        System.out.println("Kac kg alacaksiniz");
        urunMiktari=scanner.nextInt();

        switch (urunKodu){
            case 11:
              urunAdi="Elma";
              urunfiyat=25;
              System.out.println(urunMiktari + " kg " + urunAdi + "fiyati :  " + urunfiyat*urunMiktari +  "  TL  ' dir") ;
              break;
            case 12 :
             urunAdi="Muz";
             urunfiyat=40;
                System.out.println(urunMiktari + " kg " + urunAdi + "fiyati : " + urunfiyat*urunMiktari+ " Tl ' dir ");
                break;
            case 13 :
                urunAdi="Domates ";
                urunfiyat=20;
                System.out.println(urunMiktari + " kg " + urunAdi + " fiyati " + urunfiyat*urunMiktari);
                break;
            case 14 :
                urunAdi="Cilek";
                urunfiyat=100;
                System.out.println(urunMiktari + " kg " + urunAdi + " fiyati " + + urunfiyat*urunMiktari );
                break;

        }




    }





        }



    }public static void sarkuteri(){

        System.out.println("-----------Sarkuteri Reyonuna Hoşgeldiniz-----------");






    }

    public static void market(){
        System.out.println("-----------Market  Reyonuna Hoşgeldiniz-----------");





    }
    public static void  fisyazdir(){
        System.out.println("----------Fiş Yazdırılıyor------------");

    }
    public static void cikis(){
        System.out.println("----------Çıkış Yapılıyor------------");


    }
}
