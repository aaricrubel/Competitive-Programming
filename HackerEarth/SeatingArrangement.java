import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SeatingArrangement {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int x = 1;
        for (int i = 0; i < t; i++) {
            int s = Integer.parseInt(br.readLine());
            if (s<109 && s>=1) {
                switch (s/13) {
                    case 0 :
                        x = s;
                        break;
                    case 1 : 
                        x = s-12;
                        break;
                    case 2 : 
                        x = s-(12*2);
                        break;
                    case 3 :
                        x = s-(12*3);
                        break;
                    case 4 :
                        x = s-(12*4);
                        break;
                    case 5 :
                        x = s-(12*5);
                        break;
                    case 6 :
                        x = s-(12*6);
                        break;
                    case 7 :
                        x = s-(12*7);
                        break;
                    case 8 :
                        x = s-(12*8);
                    default:
                        break;
                    
                }
                switch (x) {
                    case 1:
                        System.out.print(s+11 + " WS\n");
                        break;
                    case 2 : 
                        System.out.print(s+9 + " MS\n");
                        break;
                    case 3 :
                        System.out.print(s+7 + " AS\n");
                        break;
                    case 4 :
                        System.out.print(s+5 + " AS\n");
                        break;
                    case 5 :
                        System.out.print(s+3 + " MS\n");
                        break;
                    case 6 :
                        System.out.print(s+1 + " WS\n");
                        break;
                    case 7:
                        System.out.print(s-1 + " WS\n");
                        break;
                    case 8 : 
                        System.out.print(s-3 + " MS\n");
                        break;
                    case 9 :
                        System.out.print(s-5 + " AS\n");
                        break;
                    case 10 :
                        System.out.print(s-7 + " AS\n");
                        break;
                    case 11 :
                        System.out.print(s-9 + " MS\n");
                        break;
                    case 12 :
                        System.out.print(s-11 + " WS\n");
                        break;
                    case 14 :
                        System.out.print(s+9 + " MS\n");
                        break;
                    case 16 :
                        System.out.print(s+5 + " AS\n");
                        break;
                    case 17 :
                        System.out.print(s+3 + " MS\n");
                        break;
                    default:
                        break;
                }
            }
        }
        br.close();
    }
}