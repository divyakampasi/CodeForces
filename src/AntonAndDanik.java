import java.util.Scanner;
public class AntonAndDanik {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String text = in.next();
        int a = 0;
        for (int i = 0; i < n; i++) {
            if (text.charAt(i) == 'A') {
                a++;
            }
        }
        int d = n - a;
        if (a > d) {
            System.out.println("Anton");
        } else if (d > a) {
            System.out.println("Danik");
        } else {
            System.out.println("Friendship");
        }
        in.close();
    }
}
