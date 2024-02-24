import java.util.Scanner;
 
public class WayTooLongWords {
 
    public static void main(String[] args) {
 
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        String words[] = new String[number];
        if(number>=1 && number<=100)
        {
            for(int i = 0 ; i < number ; i++)
            {
                words[i] = scan.next();
            }
        }
 
        for(int i = 0 ; i < number ; i++)
        {
            if(words[i].length()<=10 && words[i].length()>=1 && words[i].length()<=100)
                System.out.println(words[i]);
            if(words[i].length()>10 && words[i].length()>=1 && words[i].length()<=100)
            {
                String start = Character.toString(words[i].charAt(0));
                String end = Character.toString(words[i].charAt(words[i].length()-1));
                String center = Integer.toString(words[i].length()-2);
                System.out.println(start+center+end);
            }
        }
    }
}