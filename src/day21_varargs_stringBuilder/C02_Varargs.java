package day21_varargs_stringBuilder;

public class C02_Varargs {
    public static void main(String[] args) {
topla(1,2,3,4,5,6);
topla(1,2);










    } public static void topla(int... sayi){
int toplam=0;
for(int each:sayi){
    toplam+=each;
}
        System.out.println(toplam);


    }
}
