import java.util.Scanner;

public class Team {
    public static void main(String[] args){
        int count = 0;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int i=0; i<n; i++){
            int p = in.nextInt();
            int v = in.nextInt();
            int t = in.nextInt();

            if (p + v + t >= 2) {
                count++;
            }
        }

        System.out.println("Result:" + count);
    }
}