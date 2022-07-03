import java.util.Scanner;

public class Main {
    static int result = 1;
    static int f(int a, int b){

        if (b == 0){
            return 1;
        }
         result *= a;
         f(a,(b-1));
         return result;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("tabanda ki sayiyi giriniz:");
        int a= input.nextInt();
        System.out.println("ustteki sayiyi giriniz:");
        int b= input.nextInt();
        System.out.println(f(a,b));

    }
}
