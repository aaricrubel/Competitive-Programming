import java.io.*;

public class AmanAndMrSharma {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long days = Long.parseLong(br.readLine());
        long count = 0;
        while (days>0) {
            String[] str = br.readLine().split("\\s");
            long r = Long.parseLong(str[0]);
            long x = Long.parseLong(str[1]);
            double ran = 2.0 * (22.0/7.0) * r;
            long capability = 100 * x;
            if(ran<capability) {
                count++;
            }
            days--;
        }
        System.out.println(count);
        br.close();
    }
}