package day20_immutableClasses;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class LocalDate_Format {
    public static void main(String[] args) {

        LocalDate suan=LocalDate.now();

        System.out.println("Su an calismaya basladiigm zaman dilimi " + suan);

        LocalDate dogumTarihi=LocalDate.of(1996,5,26);
     LocalDate bugun=LocalDate.now();
        Period zaman= Period.between(dogumTarihi,bugun);
        System.out.println(zaman);
        // yuzbin ile 1 milyon arasindaki sayilarin toplamini
        // ve toplama isleminin kac nanosaniye surdugunu yazdirin
        LocalTime localTime = LocalTime.now();

        System.out.println("Loop baslangicinda localtime" + localTime);
        LocalTime baslangic=LocalTime.now();
        System.out.println("Baslangıcta  nano saniye " + baslangic.toNanoOfDay());


        System.out.println("Baslangic === " + baslangic);
int toplam=0;
        for (int i = 100000; i < 1000000 ; i++) {
            toplam+=i;

        }
        System.out.println("Toplam : " + toplam);
        System.out.println("Loop sonunda Localtime" + localTime);
        LocalTime bitis=LocalTime.now();
        System.out.println("Bitis  : " + bitis);
        System.out.println("Bitişte nano saniye " + bitis.toNanoOfDay());
        System.out.println("Islem suresi " + (bitis.toNanoOfDay() - baslangic.toNanoOfDay()));


    }
}
