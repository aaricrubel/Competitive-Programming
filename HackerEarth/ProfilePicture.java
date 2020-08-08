import java.io.*;

public class ProfilePicture {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int w,h;
        String[] str;
        for (int i = 0; i < n; i++) {
            str = br.readLine().split("\\s");
            w = Integer.parseInt(str[0]);
            h = Integer.parseInt(str[1]);
            if (w<l || h<l) {
                System.out.println("UPLOAD ANOTHER");
            } else if(w==h){
                System.out.println("ACCEPTED");
            }
            else if(w>l || h>l) {
                System.out.println("CROP IT");
            }
        }
    }
}