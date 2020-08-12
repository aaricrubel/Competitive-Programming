import java.util.Scanner;
public class LiftQueries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextInt();
        int lifta = 0;
        int liftb = 7;
        while(t>0) {
            int floor = sc.nextInt();
            int distance1 = floor-lifta;
            int distance2 = liftb-floor;
            if(distance2>distance1) {
                System.out.println('A');
                lifta = floor;
            } else if(distance1>distance2) {
                System.out.println('B');
                liftb = floor;
            } else if(distance1==distance2) {
                System.out.println('A');
                lifta = floor;
            }
            t--;
        }
        sc.close();
    }
}