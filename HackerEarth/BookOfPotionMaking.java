import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class BookOfPotionMaking {
    public static void main(String args[] ) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long num = Long.parseLong(br.readLine());
        long[] arr = new long[10];
        long sum = 0;
        for (int i = 0; i < 10; i++) {
            arr[i] = num%10;
            num = (long)(num/10);
        }
        for (int i = 9; i >= 0 ; i--) {
            sum+=arr[i]*(i+1);
        }
        if(sum%11==0) {
            System.out.println("Legal ISBN");
        } else {
            System.out.println("Illegal ISBN");
        }
    }
}
