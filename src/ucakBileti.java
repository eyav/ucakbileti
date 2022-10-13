import java.util.Scanner;

public class ucakBileti {
    public static void main(String[] args) {
        Double mesafe, tutar, yas, yasIndirimi, yasIndirimOrani, indirimliTutar, gdBiletIndirimi;
        int secim;

        Scanner input= new Scanner(System.in);


        System.out.println("Tarifeyi seçiniz. Gidiş için 1, Gidiş geliş için 2 ye basınız.");
        secim = input.nextInt();

        System.out.println("Yolculuk için mesafenizi giriniz:");
        mesafe = input.nextDouble();

        System.out.println("Yasinizi giriniz.");
        yas = input.nextDouble();

        if(mesafe >= 0 && yas >= 0) {

            switch (secim) {
                case 1 :
                    System.out.println("Gidiş Bileti için verilerinizi giriniz.");
                    if(yas < 12){
                        yasIndirimOrani = 0.5;
                        tutar = mesafe*0.1*(1 - yasIndirimOrani);
                        System.out.println("Toplam tutar:" + tutar);
                    }else if(yas >= 12 && yas < 24){
                        yasIndirimOrani = 0.1;
                        tutar = mesafe*0.1*(1 - yasIndirimOrani);
                        System.out.println("Toplam tutar:" + tutar);

                    }else if(yas >= 65) {
                        yasIndirimOrani = 0.1;
                        tutar = mesafe * 0.1 *( 1 - yasIndirimOrani);
                        System.out.println("Toplam tutar:" + tutar);
                    }else{

                        tutar = mesafe * 0.1 ;
                        System.out.println("Toplam tutar:" + tutar);

                    }

                    break;
                case 2 :
                    System.out.println("Gidiş-Dönüş Bileti için verilerinizi giriniz.");
                    if(yas < 12){
                        yasIndirimOrani = 0.5;
                        tutar = mesafe*0.1*(1 - yasIndirimOrani)*0.8*2;
                        System.out.println("Toplam tutar:" + tutar);
                    }else if(yas >= 12 && yas < 24){
                        yasIndirimOrani = 0.1;
                        tutar = mesafe*0.1*(1 - yasIndirimOrani)*0.8*2;
                        System.out.println("Toplam tutar:" + tutar);

                    }else if(yas >= 65) {
                        yasIndirimOrani = 0.1;
                        tutar = mesafe * 0.1 *( 1 - yasIndirimOrani)*0.8*2;
                        System.out.println("Toplam tutar:" + tutar);
                    }else{

                        tutar = mesafe * 0.1*0.8 ;
                        System.out.println("Toplam tutar:" + tutar);

                    }

                    break;

                default:
                    System.out.println("Hatalı Veri girişi");
                    break;
            }
        }else{
            System.out.println("Hatalı mesafe veya yas bilgisi girdiniz.");
        }



    }
}
