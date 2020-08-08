import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class FindProduct {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        long a[] = new long[size];
        long answer = 1;
        String[] str = br.readLine().split("\\s");
        for (int i = 0; i < str.length; i++) {
            a[i] = Long.parseLong(str[i]);
            answer = (answer * a[i]) % ((int)(Math.pow(10,9)+7));
        }
        System.out.println(answer);
    }
}