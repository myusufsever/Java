package day13_arrays;

public class C06_Arrays {
    public static void main(String[] args) {
        //Soru 4- Verilen bir array’de istenen bir elemanin var olup olmadigini
        //        ve varsa kac kere kullanildigini yazdiran bir method olusturun.
        int[] arr = {3,4,2,6,5,4,5,7,8,2,3,9};
        int arananSayi = 3;


        istenenElemansayisiniyazdir(arr,arananSayi);

    }public static void istenenElemansayisiniyazdir(int [] arr, int sayi) {
        int sayac = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == sayi) {
                sayac++;

            }
        }
            if (sayac==0){
            System.out.println("İstenen sayi bulunmamaktadir.");
        }
            else{
                System.out.println("Aranan sayi array'de " + sayac + "  defa kullanilmis");
            }





    }
}
