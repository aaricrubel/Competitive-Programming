import java.util.Scanner;
public class BricksGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int m = 0;
        int p = 0;
        int tot = 0;
        int i = 1;
        while(tot<= num) {
            p = i;
            if((tot+p)>=num) {
                System.out.println("Patlu");
                break;
            }
            tot+=p;
            m=2*p;
            if ((tot+m)>=num) {
                System.out.println("Motu");
                break;
            }
            tot+=m;
            i++;
        }
        sc.close();
    }
}