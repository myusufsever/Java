package Java_Karisik_Problemler;

import java.util.Scanner;

public class a02_soru {
    public static void main(String[] args) {
  /*
    SORU:Kullanicidan pozitif bir tamsayi alin, 1’den girilen sayiya kadar(girilen sayi
    dahil) 7 ila bolunebilen sayilari yazdirin.
     */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi giriniz");
int girilensayi=scanner.nextInt();
        for (int i = 1; i <= girilensayi ; i++) {
            if( i % 7 == 0 ) {
                System.out.print(i + "-");
            }

        }


    }
}
