public class C07_Car {

        String marka="Marka atanmamis";
        String model="Model girirlmemis";
        int yil=1900;
        int fiyat;
        C07_Car(){




        }


    @Override
    public String toString() {
        return "C07_Car{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", yil=" + yil +
                ", fiyat=" + fiyat +
                '}';
    }
    C07_Car(String mrk, String mdl,int yl,int fyt){
        marka=mrk;
        model=mdl;
        yil=yl;
        fiyat=fyt;





        }

    }
