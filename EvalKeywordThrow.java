import java.util.Scanner;
public class EvalKeywordThrow {
    public static void test(Double n) throws NullPointerException, ArithmeticException{
        if (n < 0) {
            throw new NullPointerException(
                    "KESALAHAN: null pointer");
        } else {
            throw new ArithmeticException(
                    "KESALAHAN: arithmetic exception");
        }
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Masukkan nilai:");
        Double a=input.nextDouble();
        try {
            test(a); // menimbulkan eksepsi NullPointerException
            //test(0); // menimbulkan eksepsi ArithmeticException
        } catch (ArithmeticException|NullPointerException e) {
            System.out.println("Eksepsi ditangkap di sini...");
            System.out.println(e.getMessage());
        }
        System.out.println("Statemen setelah blok try-catch");
    }
}
