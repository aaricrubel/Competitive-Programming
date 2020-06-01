import java.util.Scanner;
class increasingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        long count = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int max = a[0];
        for (int l = 1; l < n; l++) {
            int num = a[l];
            if (max <= num) {
                max = num;
            } else {
                count += (max-num);
            }
        }
        System.out.println(count);
        sc.close();
    }
}