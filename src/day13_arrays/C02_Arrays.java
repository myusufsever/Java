package day13_arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {

            int sayi= 10;
            int [] arr= {4,6,1,2,};
            // bu array'i yazdiralim
        System.out.println(arr);
        //Arraylar direk yazdirilmaz
        //direk yazdirmak isterseniz array'i degil referansini yazdirir

        //Array'i yazdirmak icin Arrays class'indan yardim almaliyiz.

        System.out.println(Arrays.toString(arr));
        String [] kelimeler ={"Ali", "okula " , "gitti"};
        System.out.println(Arrays.toString(kelimeler));

        for (int i = 0; i <kelimeler.length ; i++) {

            System.out.print(kelimeler[i] + " ");


        }





    }
}
