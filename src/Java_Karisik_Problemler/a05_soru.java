package Java_Karisik_Problemler;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class a05_soru {
     /*
        1- Kullanıcnın EYT li olup olmadığını tespit eden ve emekli olup olamayacağını yazdırın.
           Olamıyorsa kaç prim günü eksiği olduğunu yazdırın
           KURALLAR
             : 1999 yılı 9. ay öncesi işe başlamış olmak
             : Kadınlar: 5000 prim günü, 20 yıl hizmet süresi.
             : Erkekler: 5500 prim günü, 25 yıl hizmet süresi.
         */
     public static void main(String[] args) {
         Scanner scanner= new Scanner(System.in);
         System.out.println("İşe giris tarihinizi yil ve ay olarak giriniz 1999.09");
         double giris=scanner.nextDouble();
         if(giris>1999.09){
             System.out.println("EYT 'DEM FAYDALANAMIYORSUNUZ");

         }

         else {

             System.out.println("Lutfen cinsiyetinizi  E ve K olarak giriniz ");
              char cinsiyet=scanner.next().charAt(0);

         System.out.println("Lutfen prim odeme gun sayisini giriniz");
         int primGun=scanner.nextInt();
         System.out.println("Lutfen hizmet yilini surenizi giriniz");
         int hizmetSuresi=scanner.nextInt();

         if( cinsiyet == 'E' || cinsiyet== 'e'){
             if (primGun>=5500 && hizmetSuresi>=25 )
             {
                 System.out.println("Kanun yürürlülege girdi . Emekli olabilirsiniz");}
                 else if(primGun<5500 && hizmetSuresi>25){
                     System.out.println("Emekli olabilimek icin " + (5500-primGun) + "daha prim odemeniz gerekiyor") ;

                 }
             else if(primGun>5500 && hizmetSuresi<25){
                 System.out.println("Emekli olabilmek icin "  + (25-hizmetSuresi) + " yil daha calismani gerkeiyor");
             } else {
                 System.out.println("Malesef şartlari saglamiyorsunuz");
                 System.out.println("Hizmet süresi eksiği: "+(25-hizmetSuresi)+" yıl");
                 System.out.println("Eksik prim gün sayısı: "+(5500-primGun)+" gün");
             }

         } else if (cinsiyet == 'K' || cinsiyet== 'k'  ){
             if (primGun>=5000 && hizmetSuresi>=20){
                 System.out.println("Kanun yürürlüğe girdiği tarihte emekli olabilirsiniz");
             } else if (primGun<5000 && hizmetSuresi>=20) {
                 System.out.println("Emekli olabilmek için "+(5000-primGun)+" gün prim ödemelisiniz.");
             } else if (primGun>=5000 && hizmetSuresi<20) {
                 System.out.println("Emekli olabilmek için "+ (20-hizmetSuresi)+" yıl daha çalışmalısınız.");
         }

         }else {
             System.out.println("Maalesef henüz EYT şartlarının ikisinide sağlamıyorsunuz");
             System.out.println("Hizmet süresi eksiği: " + (20 - hizmetSuresi) + " yıl");
             System.out.println("Eksik prim gün sayısı: " + (5000 - primGun) + " gün");

         }}
     }
}
