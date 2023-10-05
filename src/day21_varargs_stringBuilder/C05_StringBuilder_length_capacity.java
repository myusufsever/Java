package day21_varargs_stringBuilder;

import java.util.SimpleTimeZone;

public class C05_StringBuilder_length_capacity {
    public static void main(String[] args) {
 StringBuilder sb1=new StringBuilder();
        System.out.println(sb1.length()); //0
        System.out.println(sb1.capacity());
        System.out.println(sb1.capacity());
        StringBuilder sb2= new StringBuilder("Ali Can");
        System.out.println(sb2.length()); //7
        System.out.println(sb2.capacity()); //23
StringBuilder sb3=new StringBuilder(11);
//icinde hic bir yazi yok lenght==0;
        System.out.println("sb3 length : "+sb3.length()); // 0
        System.out.println("sb3 capacity : "+sb3.capacity()); // 16;
        // Eger stringBuilder'a ekleme yaparsaniz
        // java eklenecek metni de alabilmesi icin
        // sb'in kapasitesitini 2 * eski kapasite + 2 seklinde artirir
sb2.append(" okula gitmek istiyor");
        System.out.println("sb2 : " + sb2);
        System.out.println(sb2.length());
        System.out.println(sb2.capacity());
        //Eger kapasite ve lenght'i esitlemek isterseniz.

        sb2.trimToSize();
        System.out.println("sb2: " + sb2);
        System.out.println(sb2.length()); //28
        System.out.println(sb2.capacity()); //28



    }
}
