package day13_arrays;

public class C01_Arrays {
    public static void main(String[] args) {
        int [] arr = new int [5];

        /*
        Bir array olusutrulurken 2 sey mutlaka deklare edilmelidir

       1- icine koyulacak elementrlerin data turu
       2-Array'in icine koyulacak element sayisi(lengh)

       eger arraay'i yukaridaki gibi olusturursak
       biz hic bir deger atamasi yapmadigimiz icin
       java defeult olarak belirledigi degerleri atayacaktir .
       Array olusturulduktan sonra ,
       olmayan index kullanilarak yeni deger  atamasi/eklemesi MUMKUN degildir

         */
 int [] arr2 = {4,1,7,5}; //lenght=4
        System.out.println(arr2[1]);
        System.out.println(arr2[3]);
        System.out.println(arr2[arr2.length - 1]);
        //ilk array'de deger atamasi yapmadik
        System.out.println(arr[0]);
        System.out.println(arr[arr.length - 1]);

        //olmayan index'deki bir elemente ulasmak istersek
 //arrayindexoutboundsexception
        //olmayan bir index'te atama yapabilir miyiz?

        arr=new int[10];
        arr=new int[20];
        System.out.println(arr[9]);


    }
}
