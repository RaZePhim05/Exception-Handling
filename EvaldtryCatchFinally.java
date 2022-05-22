import java.util.Scanner;

public class EvaldtryCatchFinally {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Selamat datang di program pembagian");
        System.out.println("Masukkan angka 0:");
        int a= input.nextInt();
        System.out.println("Masukkan bil yang akan dibagi: ");
        int b=input.nextInt();
        try{
            int hasil=b/a;
            System.out.println("Hasil dari pembagian:  ");
        } catch(java.lang.ArithmeticException e){
            System.out.println("terjadi pembagian dengan nol");
            System.out.println("diatasi blok penanganan sendiri");
            System.out.println(e);
        } finally {
            System.out.println("Akhir");
        }

        System.out.println("Hasil dari pembagian: "+a/b);
    }
}
