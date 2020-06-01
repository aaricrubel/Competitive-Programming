import java.util.Scanner;
public class missingNumberCopied {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x; long sum = 0;
        for (int i = 0; i < n-1; i++) {
            x = sc.nextInt();
            sum+=x;
        }
        System.out.println((long) (n) * (n+1)/2 - sum);
        sc.close();
    }
}