import java.util.Scanner;
public class Anagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0) {
        char[] firstarr = sc.next().toCharArray();
        char[] secondarr = sc.next().toCharArray();
        int x = firstarr.length;
        int y = secondarr.length;
        int count = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (firstarr[i] == secondarr[j]) {
                    ++count;
                    secondarr[j] = '0';
                    break;
                }
            }
        }
        int z = (x+y) - (2*count);
        System.out.println(z);
        t--;
    }
    sc.close();
    }
}