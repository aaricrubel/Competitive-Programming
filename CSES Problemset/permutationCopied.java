import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class permutationCopied {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if (n == 1) 
        System.out.print("1\n");
        else if (n < 4) 
        System.out.print("NO SOLUTION\n");
        else if (n == 4) 
        System.out.print("3 1 4 2\n");
        else {
                for (int i = 1; i <= n; i += 2) 
                System.out.print(i + " ");
                for (int i = 2; i <= n; i += 2) {
                    System.out.print(i);
                    if (i < n - 1) 
                    System.out.print(" ");
                    else 
                    System.out.println();
                }
        }
    }
}