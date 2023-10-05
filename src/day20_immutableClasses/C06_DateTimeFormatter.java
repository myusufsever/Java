package day20_immutableClasses;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class C06_DateTimeFormatter {
    public static void main(String[] args) {


     //   Yazdigimiz kodlarda zaman veya tarih ile ilgili islemlerde
     //   DateTimeFormatter Clas'ini kullanabiliriz
        //  tarih veya zamani istedigimiz formatta tutabilmek icin
        //    DateTimeFormatter Clas'ini kullanabiliriz

        LocalTime localTime=LocalTime.now();
        System.out.println(localTime);
//05 Oct 2023 Thu
LocalDateTime ldt= LocalDateTime.now();
        DateTimeFormatter istenenFortmat=DateTimeFormatter.ofPattern("dd MMM yyyy EEE");
        System.out.println(ldt.format(istenenFortmat));

    }
}
