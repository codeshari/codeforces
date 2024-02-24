import java.util.Scanner;
 
public class NearlyLuckyNumber {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int count = 0;
 
        for(int i = 0 ; i < input.length() ; i++)
        {
            if(input.charAt(i) == '4' || input.charAt(i) == '7')
                count++;
        }
 
        if(count == 4 || count == 7)
            System.out.println("YES");
 
        else
            System.out.println("NO");
 
    }
}