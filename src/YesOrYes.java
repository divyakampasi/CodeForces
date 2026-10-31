import java.util.Scanner;
public class YesOrYes {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            String s = in.next();

            if (s.equalsIgnoreCase("YES")) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        in.close();
    }
}
