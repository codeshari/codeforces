import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class StringTask {
 
    /* In the given string,
        deletes all the vowels,
        inserts a character "." before each consonant,
        replaces all uppercase consonants with corresponding lowercase ones. */
 
    public static void main(String[] args) {
 
        Scanner scan = new Scanner(System.in);
        String string = scan.next();
 
        int k = 0;
        List<Character> outArray = new ArrayList<Character>();
        int length = string.length();
        //char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        char[] consonants = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'z',
                             'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Z'};
        char[] array = string.toCharArray();
 
        for(int i = 0 ; i < length ; i++)
        {
            for(int j = 0 ; j < consonants.length ; j++)
            {
                if(array[i] == consonants[j])
                {
                    outArray.add('.');
                    if(Character.isUpperCase(array[i]))
                        outArray.add(Character.toLowerCase(array[i]));
                    else
                        outArray.add(array[i]);
                }
            }
        }
 
        char[] outCharArray = new char[outArray.size()];
        for(int i = 0 ; i < outArray.size(); i++)
        {
            outCharArray[i] = outArray.get(i);
        }
 
        System.out.println(String.valueOf(outCharArray));
    }
 
}