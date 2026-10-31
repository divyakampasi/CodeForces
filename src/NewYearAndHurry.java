import java.util.Scanner;
public class NewYearAndHurry {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int limit = 240-k;
        int count = 0;
        int i=1;

        while (i <= n && limit >= 5 * i) {
            limit = limit - (5 * i);
            count++;
            i++;
        }
        System.out.println(count);
        in.close();
    }
}
