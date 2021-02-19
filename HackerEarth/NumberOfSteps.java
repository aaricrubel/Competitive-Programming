import java.util.*;
public class NumberOfSteps {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        int min = 99999;
        int count = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (a[i] < min) {
                min = a[i];
            }
        }
        for (int k = 0; k < n; k++) {
            b[k] = sc.nextInt();
        }
        for (int j = 0; j < n; j++) {
            while (a[j] > min) {
                if (a[j] >= b[j]) {
                    a[j] = a[j] - b[j];
                    count = count + 1;
                }
            }
            if (a[j] < min) {
                min = a[j];
            }
        }
        for (int l = 0; l < n; l++) {
            if (a[l] != min) {
                count = -1;
            }
        }
        System.out.println(count);
        sc.close();
    }
}