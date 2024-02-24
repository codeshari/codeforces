import java.util.Scanner;
 
public class Rook {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        String s;
        int testCases;
        testCases = sc.nextInt();
 
 
        for(int i=0; i<testCases; i++) {
            s = sc.next();
 
            int n = Character.getNumericValue(s.charAt(1));
            char ch = s.charAt(0);
            for (int row = 1; row<=8; row++) {
                for (int col = 'a'; col <= 'h'; col++) {
 
                    if(col == ch || row == n) {
                        if(col == ch && row == n) {
                            continue;
                        }
                        System.out.println((char)col+ "" + row);
                    }
                }
            }
        }
 
 
    }
}