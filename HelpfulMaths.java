import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
 
public class HelpfulMaths {
 
    public static void main(String[] args) {
 
        //Declaration
        List<Character> updatedString = new ArrayList();
        List<Character> outStringList = new ArrayList();
 
        //Getting the input as string.
        Scanner sc = new Scanner(System.in);
        String string = sc.next();
        int length = string.length();
 
        //Removing the char '+' from the received input and storing it in new list.
        for(int i = 0 ; i < length ; i++)
        {
            if(string.charAt(i) != '+')
                updatedString.add(string.charAt(i));
        }
 
        //Sorting the processed (i.e., list received after removing char '+') list.
        Collections.sort(updatedString);
        //System.out.println(updatedString);
 
        //Adding the char '+' in between the sorted numbers in the list.
        for (int i = 0 ; i < updatedString.size() ; i++)
        {
            outStringList.add(updatedString.get(i));
            if(i != updatedString.size()-1)
                outStringList.add('+');
        }
        //System.out.println(outStringList);
 
        //Converting the final processed list to string.
        char[] outCharArray = new char[outStringList.size()];
        for(int i = 0 ; i < outStringList.size() ; i++)
            outCharArray[i] = outStringList.get(i);
        System.out.println(String.valueOf(outCharArray));
    }
}