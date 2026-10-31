import java.util.Scanner;
public class Games {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int count =0;


        for(int i=0; i<n; i++){
            a[i]=in.nextInt();
            b[i]=in.nextInt();
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(a[i]==b[j] && i!=j){
                    count++;
                }
            }
        }
        System.out.println(count);
        in.close();
    }
}
