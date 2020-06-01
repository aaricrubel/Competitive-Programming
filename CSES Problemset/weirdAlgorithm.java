import java.util.Scanner;
public class weirdAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if (n > 1) {
            do {
            System.out.print(n + " ");
            if (n % 2 == 0) {
                n = n/2;
            } else {
                n = n*3 + 1;
            }
           } while(n!=1);
           System.out.print(1);
        }
        else {
            System.out.println(1);
        }
        sc.close();
    }
}