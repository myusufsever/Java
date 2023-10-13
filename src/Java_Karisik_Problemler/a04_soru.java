package Java_Karisik_Problemler;

import java.util.Scanner;

public class a04_soru {
    /*
     * Girilen bir stringdeki a harfi sayısını bulunuz ve yazdırınız.
     * Ama c harfine gelirse döngüden çıkılsın
     * Bugün hava oldukca güzel.-> 2
     *
     *
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String girilencumle=scanner.nextLine();
        int sayac=0;
        for (int i = 0; i <girilencumle.length() ; i++) {


        if (girilencumle.toUpperCase().charAt(i)=='A' ) {
            sayac++;

        }   if (girilencumle.toUpperCase().charAt(i)=='C' ) {
            break;
            }


        }
        System.out.println("Cümlenizde c harfine kadar  "+sayac+" adet a harfi vardır.");

    }






}
