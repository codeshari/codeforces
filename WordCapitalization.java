import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class WordCapitalization {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        String string = sc.next();
        List<Character> outCharArray = new ArrayList<Character>();
        for(int i = 0 ; i < string.length() ; i++)
        {
            if(i == 0)
                outCharArray.add(Character.toUpperCase(string.charAt(0)));
            else if (i != 0)
                outCharArray.add(string.charAt(i));
        }
 
        char[] outChar = new char[outCharArray.size()];
        for(int i = 0 ; i < outCharArray.size() ; i++)
            outChar[i] = outCharArray.get(i);
 
        System.out.println(String.valueOf(outChar));
 
    }
}