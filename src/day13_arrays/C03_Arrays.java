package day13_arrays;

import java.util.Arrays;

public class C03_Arrays {
    public static void main(String[] args) {

        //verilen int bir array'deki tüm elementlerin degerini 2 arttirn
        int[] arr = {3,5,7,10,2,6};

        for (int i = 0; i <arr.length ; i++) {
            arr[i]+=2;


        }
        System.out.println(Arrays.toString(arr));


    }
}
