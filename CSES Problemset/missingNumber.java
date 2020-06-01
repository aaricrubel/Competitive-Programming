import java.util.Scanner;
public class missingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = (n) * (n+1)/2;
        int sum1 = 0;
        int a[] = new int[n-1];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
            sum1 = sum1 + a[i];
        }
        System.out.println(sum - sum1);
        sc.close();
    }
}