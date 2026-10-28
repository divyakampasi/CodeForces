import java.util.Scanner;
public class SoldierAndBananas {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int k = in.nextInt(); //cost of first banana
        int n = in.nextInt(); //initial dollars on soldier
        int w = in.nextInt(); // total no. of bananas

        int total = 0;

        for(int i=1; i<=w; i++){
            total = total+ i*k;
        }
        int remaining = Math.max(0, total - n);

        System.out.println(remaining);
        in.close();
    }
}
