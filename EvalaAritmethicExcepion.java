import java.util.Scanner;

public class EvalaAritmethicExcepion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Pembagian bilangan dengan 0");
        System.out.println("Masukkan nilai:");
        int c=in.nextInt();
        try{
            int hasil=c/0;
            System.out.println("Hasilnya: "+hasil);
        } catch (Exception e){
            System.out.println("Terjadi error");
        } finally {
            System.out.println("Maaf ulangi lagi");
        }
    }
}
