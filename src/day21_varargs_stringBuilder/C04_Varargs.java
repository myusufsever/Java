package day21_varargs_stringBuilder;

public class C04_Varargs {
    public static void main(String[] args) {

        // istenen kadar int parametre alip
        // ilk sayi disindaki tum sayilari toplayip
        // bulunan toplami ilk sayi ile carpip yazdiran
        // bir method olusturun


toplacarp(1,2,3,4,5,6);





    }public static void toplacarp(int ilksayi,int... sonlar){
        int toplam=0;
        for (int each:sonlar
             ) {
            toplam+=each;
        }
        System.out.println(ilksayi * toplam);
    }
}
