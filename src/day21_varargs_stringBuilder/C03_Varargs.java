package day21_varargs_stringBuilder;

public class C03_Varargs {

    public static void main(String[] args) {

        // 1 int ve istenen kadar String parametre alip
        // String parametre sayisi ile int sayinin carpimini yazdiran
        // bir method olusturun

varArgscarpim(5,"a","b","c" );





    }public static void varArgscarpim(int sayi , String... parametre){
        System.out.println(sayi * parametre.length);


    }
}
