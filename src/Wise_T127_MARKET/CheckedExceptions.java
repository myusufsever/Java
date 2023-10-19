package Wise_T127_MARKET;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedExceptions {
    public static void main(String[] args) throws IOException {
    /*
            Eger birden fazla exception olusma ihtimali varsa
            ve biz try-catch yerine throws keyword kullanmak istiyorsak
            en genis yakalama kapasitesi olan (en ince elek araligi olan)
            parent exception'i yazmamiz yeterli olacaktir
         */

        FileInputStream fis=new FileInputStream("Wise_T127_MARKET/text.txt");
int k =0;
while((k = fis.read()) == (-1)){
    System.out.println((char)k);
}







    }
}
