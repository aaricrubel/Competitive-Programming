// 1 Test Case failed in this code. Test Case #10 in CSES.
import java.util.Scanner;
public class repetitions {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int countA = 0;
        int countC = 0;
        int countG = 0;
        int countT = 0;
        for (int i = 1; i < n.length(); i++) {
            if(n.charAt(i) == 'A' && n.charAt(i-1) == 'A') 
                countA++;
            else if(n.charAt(i) == 'C' && n.charAt(i-1) == 'C')
                countC++;
            else if(n.charAt(i) == 'G' && n.charAt(i-1) == 'G')
                countG++;
            else if(n.charAt(i) == 'T' && n.charAt(i-1) == 'T')
                countT++;
        }
        System.out.println(Math.max(Math.max(countA,countC),Math.max(countG,countT)) + 1);
        sc.close();
    }
}