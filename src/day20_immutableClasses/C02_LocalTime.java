package day20_immutableClasses;

import java.time.LocalTime;
import java.time.ZoneId;

public class C02_LocalTime {
    public static void main(String[] args) {
 /*
            localtime objesi canli bir kronometre degil
            olusturuldugu anda sistemin saat bilgisini kaydeden bir variable'dir.
         */

        LocalTime localTime=LocalTime.now();
        System.out.println(localTime); //22:30:42.639475600


        LocalTime TurkiyeSaati=LocalTime.now(ZoneId.of("Europe/Paris")).plusHours(1);



    }
}
