package Practise_Day06;

import java.util.Scanner;

public class for_Loop {
    public static void main(String[] args) {


        /*Kullanicidan pozitiif bir tam sayi alin 1 'den girilen sayıyıa kadar (girilen sayi daahil)
        7 ile bolunebilen sayilari yazdirin
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz: ");
        int sayi = scanner.nextInt();
        for (int i = 0; i <= sayi ; i++) {
           if (i%7==0){
               System.out.print(i + " ");
           }
        }


    }
}
