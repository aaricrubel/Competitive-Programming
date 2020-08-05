import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SeatingArrangement {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int s;
        while(t>0){
            s = Integer.parseInt(br.readLine());
            if(s%12==0){
                System.out.println((s-11) + " WS\n");
            }
            else if(s%12==1){
                System.out.println((s+11) + " WS\n");
            }
            else if(s%12==2)
                System.out.println((s+9) + " MS\n");
            else if(s%12==3)
                System.out.println((s+7) + " AS\n");
            else if(s%12==4)
                System.out.println((s+5) + " AS\n");
            else if(s%12==5)
                System.out.println((s+3) + " MS\n");
            else if(s%12==6)
                System.out.println((s+1) + " WS\n");
            else if(s%12==7)
                System.out.println((s-1) + " WS\n");
            else if(s%12==8)
                System.out.println((s-3) + " MS\n");
            else if(s%12==9)
                System.out.println((s-5) + " AS\n");
            else if(s%12==10)
                System.out.println((s-7) + " AS\n");
            else if(s%12==11)
                System.out.println((s-9) + " MS\n");
            t=t-1;
        }
        br.close();
    }
}