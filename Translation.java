import java.util.Scanner;
 
public class Translation {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        int count = 0;
        String correctWord =  sc.next();
        String translation = sc.next();
        StringBuilder reversedWord = new StringBuilder();
 
        for(int i = correctWord.trim().length()-1 ; i >= 0  ; i--)
        {
            reversedWord.append(correctWord.charAt(i));
        }
 
        if(reversedWord.length() == translation.length())
        {
            for(int i = 0 ; i < correctWord.length(); i++)
            {
                if(reversedWord.charAt(i) == translation.charAt(i))
                    count++;
            }
        }
 
        if(count == correctWord.length())
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}