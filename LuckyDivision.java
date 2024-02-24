import java.util.Scanner;
 
public class LuckyDivision {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int count = 0;
        
        for(int i = 0 ; i < input.length() ; i++)
        {
            if(input.charAt(i) == '4' || input.charAt(i) == '7')
                count++;
        }
 
        if(count == input.length())
            System.out.println("YES");
 
        else if(Integer.valueOf(input)%4 == 0 || Integer.valueOf(input)%7 == 0 || Integer.valueOf(input)%47 == 0)
            System.out.println("YES");
 
        else
            System.out.println("NO");
    }
}