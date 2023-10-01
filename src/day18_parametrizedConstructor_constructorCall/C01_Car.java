package day18_parametrizedConstructor_constructorCall;

public class C01_Car {
    String marka=" Marka atanmamis";
    String model=" Model atanmamis ";
    String renk= "Renk atanmamis";
   int yil=1900;
   int fiyat;
    public C01_Car(){

/*
default constructor ile parametresiz constructor'in en buyuk farki default constructorun  body
'si bos iken
parametresiz cons'lara kod yazilabilir
bu durumda yapilan butun atamalar tum araclar icin standart olarak uygulanir
 */

    } public C01_Car(String mrk,String mdl, String rnk){
        marka=mrk;
        model=mdl;
        renk=rnk;
    }
    C01_Car(String marka, String model,String renk,int fiyat){
        this.marka=marka;
        this.model=model;
        this.renk=renk;
        this.fiyat=fiyat;
    }
    //tum instance'lar icin parametre alan bir cons. olusturalim
    //biz hep toyata satiyoruz renkleri hep mavi
    C01_Car(String model,int yil){
 this.model=model;
 this.yil = yil;
        marka="Toyata";
        renk="Mavi";
    }

    @Override
    public String toString() {
        return "C01_Car{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", yil='" + yil + '\'' +
                '}';
    }
}
