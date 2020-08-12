import java.io.*;

public class CostOfBalloons {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t>0) {
            String[] str = br.readLine().split("\\s");
            int costp = Integer.parseInt(str[0]);
            int costg = Integer.parseInt(str[1]);
            int countp = 0, countg = 0;
            int num = Integer.parseInt(br.readLine());
            int a[][] = new int[num][2];
            String[] str1;
            int x,y;
            for (int i = 0; i < num; i++) {
                str1 = br.readLine().split("\\s");
                x = Integer.parseInt(str1[0]);
                y = Integer.parseInt(str1[1]);
                a[i][0] = x;
                a[i][1] = y;
                if (a[i][1] == 1) {
                    countg++;
                }
                if(a[i][0]==1) {
                    countp++;
                }
            }
            int cost1 = (countg * costp) + (countp*costg);
            int cost2 = (countg * costg) + (countp*costp);
            
            System.out.println(Math.min(cost1,cost2));
            t--;
        }
        br.close();
    }
}