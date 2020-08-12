import java.io.*;
import java.util.Arrays;
public class TwoStrings {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t>0) {
            String[] str = br.readLine().split("\\s");
            String first = str[0];
            String second = str[1];
            char[] firstarr = first.toCharArray();
            char[] secondarr = second.toCharArray();
            Arrays.sort(firstarr);
            Arrays.sort(secondarr);
            String first2 = String.valueOf(firstarr);
            String second2 = String.valueOf(secondarr);
            if (first2.equals(second2)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            t--;
        }
        br.close();
    }
}