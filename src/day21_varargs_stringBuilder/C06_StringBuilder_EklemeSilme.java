package day21_varargs_stringBuilder;

import com.sun.tools.javac.Main;

public class C06_StringBuilder_EklemeSilme {
    public static void main(String[] args) {

 StringBuilder sb=new StringBuilder("Java Candir");
 sb.append(".");
        System.out.println(sb); //Java Candir.
        String str="Hava cok guzel";
        sb.append(str,5,8); //Java Candir.cok
        sb.append(str,0,4); //Java Candir.cokHava
        sb.insert(5,"cok "); //JavacokCandir.cokHava
        System.out.println(sb);
        sb.insert(19,str,8,14);
        System.out.println(sb);//Java cok Candir.cokguzel
        sb.delete(16,25);
        System.out.println(sb); //Java cok Candir
        // index saymadan "cok " silin
        int indexCok=sb.indexOf("cok");
        sb.delete(indexCok,indexCok+4);
        System.out.println(sb);
        int HavaIndex=sb.indexOf("Hava");
        sb.delete(HavaIndex,HavaIndex+4);
        System.out.println(sb);
        // sondaki karakteri silin
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb);

    }
}
