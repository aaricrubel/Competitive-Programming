import java.util.Scanner;
public class repetitionsCopied {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        char c = n.charAt(0);
        int count = 1, max = 1;
        for (int i = 1; i < n.length(); i++) {
            if (n.charAt(i) == c) 
                count++;
            else {
              max = Math.max(max, count);
              count = 1;
              c = n.charAt(i);
            }
          }
          System.out.println(Math.max(max, count));
        sc.close();
    }
}