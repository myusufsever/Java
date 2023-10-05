package day21_varargs_stringBuilder;

public class StringBuilder_StringMethodlari {
    public static void main(String[] args) {

/*
            StringBuilder ile bazi String method'lari da kullanilabilir
            bize String veya char donduren method'lar
            kalici degisiklik yapmazlar

            Bazi String method'lari ise StringBuilder'da yoktur
            kullanmak istersek
            sb.toString() ile once String'e cevirir, sonra istenen String method'u kullanilabilir
            boyle yapilan degisiklikler sb'da kalici degisiklik YAPMAZ
         */
       StringBuilder sb = new StringBuilder("Java");
        sb.substring(2);
        System.out.println(sb);
        System.out.println(sb.substring(2));
        sb.charAt(2);
        System.out.println(sb.charAt(2));
        System.out.println(sb);
        // void olan setCharAt() kalici degisiklik yapar
        sb.setCharAt(0,'H'); //Hava
        System.out.println(sb);
        // sb  "a" iceriyor mu ?

        System.out.println(sb.toString().contains("a"));

    }
}
