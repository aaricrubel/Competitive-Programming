import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class permutationSinha {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if (n == 1) 
        System.out.print("1\n");
        else if (n < 4) 
        System.out.print("NO SOLUTION\n");
        else {
                for (int i = (n/2)+1; i <= n; i ++) {
                System.out.print(i + " " + (i-(n/2)) + " ");
		if(i==n){
		System.out.print(i);
		}
		}
        }
    }
}