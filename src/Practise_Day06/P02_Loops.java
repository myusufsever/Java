package Practise_Day06;

import java.util.Scanner;

public class P02_Loops {

          public static void main(String[] args) {
                    /*
    Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
    dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
    baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin
     */

              Scanner scanner=new Scanner(System.in);
              System.out.println("Lutfen baslangic degerini pozitif bir tam sayi giriniz");
              int baslangic=scanner.nextInt();
              System.out.println("Lutfen bitis degerini pozitif bir tam sayi giriniz");
              int bitis=scanner.nextInt();
              int toplam=0;
              if (bitis<baslangic){

                  System.err.println("UYARI ");

              }
              else  {
                  for (int i=baslangic ; i<=bitis ; i++) {
                      toplam=i+toplam;
                  }
                  System.out.println(" TOPLAM DEGER :" + toplam);
              }


          }


}
