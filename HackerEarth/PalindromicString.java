import java.util.Scanner;
public class PalindromicString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int n = text.length() - 1;
        String rev = "";
        for (int i = n; i >=0; i--) {
            rev = rev+text.charAt(i);
        }
        if(text.equals(rev))
            System.out.println("YES");
        else
            System.out.println("NO");
        sc.close();
    }
}