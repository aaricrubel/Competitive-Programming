import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class emazein {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String z = br.readLine();
        char[] text = z.toCharArray();
        int x = 0; int y = 0;
        for (int i = 0; i < text.length; i++) {
            if (text[i] == 'L') {
                x--;
            } else if(text[i] == 'R') {
                x++;
            } else if (text[i] == 'U') {
                y++;
            } else if(text[i] == 'D') {
                y--;
            }
        }
        System.out.println(x + " " + y);
        br.close();
    }
}