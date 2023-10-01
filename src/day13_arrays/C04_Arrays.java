package day13_arrays;

import java.util.Arrays;

public class C04_Arrays {
    public static void main(String[] args) {
        //verilen string bir array'de
        //istenen harfi iceren elementleri yazdzirin
        String [] isimler = { "Huseyin","Mehmet","Esra","Ercan","Omer"};
        String istenenHarf = "x";

        for (int i = 0; i <isimler.length; i++) {

            if(isimler[i].contains(istenenHarf)){
                System.out.println("Harfi iceren element :  " + isimler[i]);
            }

        }






    }
}
