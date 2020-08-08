import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zoo {
    public static void main(String args[] ) throws IOException {
        int f=1,g=2;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));;
        String x = br.readLine();                
        if(x.length() <= 20) {
            char[] ch = x.toCharArray();
            for(int i=0;i<x.length();i++) {
                if(ch[i] == 'z')
                    f++;
                else if(ch[i] == 'o')
                    g++;
            }
            if(g==2*f)
                System.out.println("Yes");
            else   
                System.out.println("No");
        }

    }
}