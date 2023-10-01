package day13_arrays;

public class C05_EnUzunKelime {
    public static void main(String[] args) {


    // Soru 6- Verilen String bir array’deki
    //         en uzun ve en kisa kelimeleri yazdiran bir method olusturun.
    String [] isimler = { "Zehra","Huseyin","Mehmet","Esra","Ali","Ercan","Omer"};

    enUzunEnkisaYazdir(isimler);

    }public static void enUzunEnkisaYazdir(String [] arr){
String enKisaisim= arr[0];
String enUzunisim=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(enKisaisim.length()>arr[i].length()){
                enKisaisim=arr[i];


            }
            if(arr[i].length()>enUzunisim.length()){
               enUzunisim=arr[i];
            }
        }
        System.out.println("En kisa isim  :  " + enKisaisim);
        System.out.println("En uzun isim : " + enUzunisim);

    }


}
