package day18_parametrizedConstructor_constructorCall;

import java.util.Scanner;

public class İfElseStatements {
    public static void main(String[] args) {

        /* Ogrenci notunu harf notuna donusturen bir kod yaziniz.
        85 - 100 AA
        80 - 85  BA
        75 - 80  BB
        65 - 75  CB
        58 - 65  CC
        50 'in alti ise ... FF
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen notu girinz");
        int not=scanner.nextInt();
        if(not>=85 && not<=100) {
            System.out.println("Ogrenci harf notunuz +  AA");
        }else if(not<85  && not>80 ) {
                System.out.println("Ogrenci harf notunuz  BA");

            }else if(not<80 && not>75){
            System.out.println("Ogrenci harf notunuz BB");

        } else if(not>65 && not<75){
            System.out.println("CB");

        } else if(not<65&& not>58){
            System.out.println("CC");
        }
        else if(not<50){
            System.out.println("FF");
        }


    }
}
