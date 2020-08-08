import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CountDivisors {
    public static void main(String args[] ) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));;
        int l,r,k,c=0;
        String[] str = br.readLine().split("\\s");
        l = Integer.parseInt(str[0]);
        r = Integer.parseInt(str[1]);
        k = Integer.parseInt(str[2]);
        for(int i = l; i<=r; i++)
        {
            if(i%k==0)
                c++;
        }
        System.out.println(c);
        br.close();
    }
}