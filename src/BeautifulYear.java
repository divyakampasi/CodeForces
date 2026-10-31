import java.util.HashSet;
import java.util.Scanner;
public class BeautifulYear {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        while(true){
            year++;
            String s = String.valueOf(year);
            HashSet<Character> hs = new HashSet<>();
            for(char c: s.toCharArray()){
                hs.add(c);
            }
            if (hs.size() == 4) {
                System.out.println(year);
                break;
            }
        }
        in.close();
    }
}

