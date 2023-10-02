package day18_parametrizedConstructor_constructorCall;

import java.util.Scanner;

public class C02_İf_statements {
    public static void main(String[] args) {
//Kullanicida gun ismini alin ve haftaici veya harftasonu oldugun yazdirin
//String icin equals methodunu salı kullanin

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen su an bulundugunuz gunu giriniz : ");
         String gun=scanner.next().toLowerCase();
         if(gun.equals("pazartesi") || gun.equals("sali") ||gun.equals("carsamba")||gun.equals("persembe") || gun.equals("cuma")) {
             System.out.println("Haftaici");
         }


        if(gun.equals("cumartesi") || gun.equals("pazar")) {
            System.out.println("Haftasonu");
        }



            if(!(gun.equals("pazartesi") || gun.equals("sali") ||gun.equals("carsamba")||gun.equals("persembe") || gun.equals("Cuma") || gun.equals("cumartesi")|| gun.equals("pazar") )) {
                System.out.println("hatali giris yaptiniz");
            }


    }
}
