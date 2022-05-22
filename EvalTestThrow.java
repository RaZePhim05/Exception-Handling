import java.util.Scanner;

public class EvalTestThrow {
    static void validate(int usia) throws data {
        Scanner in = new Scanner(System.in);
        if (usia < 18)
            throw new data("Belum cukup umur");
        else
            System.out.println("welcome to vote");
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan usia anda:");
        int usia=in.nextInt();
        try {
            validate(usia);
        } catch (Exception i) {
            System.out.println("Exception aktif\n" + i);
        }
        System.out.println("rest ");
    }
}
