package lesson37_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_CheckedExceptions {


    public static void main(String[] args) {


        int k=0;

        String dosyayolu="src/lesson36_checkedExceptions/Deneme.txt";
        try {
            FileInputStream fis=new FileInputStream(dosyayolu);
            while((k=fis.read())!=-1) {
                System.out.print((char)k);
            }



        } catch (FileNotFoundException e) {

            System.out.println("dosya yolu yanlış veya dosya arızalı ");

        } catch (IOException e) {

            System.out.println("dosya okuma ve yazma ile ilgili bir sorun var");
        }

           /*
           Bir kod calisirken birden fazla exception olusma ihtimali varsa
           bu kodu calisir hale getirmek icin 4 ihtimal vardir
           1- herbir exception ic ice try-catch bloklari kullanmak
           2- Bir tane try blogu birden fazla catch blogu olusturmak
           3- method signature'na tum exception ihtimallerini yazmak (exceptions handle edilmis olmaz)
           4- eger muhtemel exceptiopn'larin tumunu kapsayan, daha genis kapsamli bir exception varsa
              onu kullanmak
         */

        /*
          2.ve 3.ihtimallerde olusmasi muhtemel exception'lar arasinda
          parent-child iliskisi olup olmadigi kontrol edilmelidir.
          aralarinda parent-child iliskisi yoksa
          exception'lari istedigimiz sirada yazabiliriz
          Ancak parent-child iliskisi varsa
          once child, sonra parent yazilmalidir
          aksi takdirde parent daha kapsamli oldugundan tum exception'lari yakalar
          ve asagidaki child exception islevsiz kalir
          java bu durumu kabul etmez, CTE verir
         */







    }
}
