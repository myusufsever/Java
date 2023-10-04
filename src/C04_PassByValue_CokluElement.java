import java.util.Arrays;
import java.util.Random;

public class C04_PassByValue_CokluElement {
    public static void main(String[] args) {

int[] arr= {1,2,3};
        System.out.println("Arrray'in ilk hali"+ Arrays.toString(arr));
        elemanlari2arttir(arr);
        System.out.println("Array'i artir method call'indan sonra arr : " + Arrays.toString(arr));

        arrayiDegistir(arr);

        System.out.println("Array'i degistir method'undan sonra arr  " + Arrays.toString(arr));


    }
    public static   void elemanlari2arttir(int [] arr){

        for (int i = 0; i <arr.length ; i++) {

            arr[i]+=2;


        }

        System.out.println("Elemanlari 2 artirilmis array'in son hali " + Arrays.toString(arr));


    }public static void arrayiDegistir(int [] arr ){
        // yeni 3 elemanli bir array olusturup
        // icine rastgele 100'den kucuk sayilar koyun
        // arr'ye bu yeni degeri atayin
        // ve arr'yi yazdirin


        int [] arr2=new int[3];
        Random random = new Random();
        for (int i = 0; i <arr2.length  ; i++) {

            arr2[i]= random.nextInt(100);

        }
        arr=arr2;

        System.out.println("Array'i degistir method'unda arr : " + Arrays.toString(arr));


    }
}
