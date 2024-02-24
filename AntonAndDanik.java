import java.util.Scanner;
 
public class AntonAndDanik {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        int rounds = sc.nextInt();
        String wonString = sc.next();
        int anton = 0, danik = 0;
 
        for(int i = 0 ; i < rounds ; i++)
        {
            if(wonString.charAt(i) == 'A')
                anton++;
            if(wonString.charAt(i) == 'D')
                danik++;
        }
 
        if(anton>danik)
            System.out.println("Anton");
        else if (danik>anton)
            System.out.println("Danik");
        else
            System.out.println("Friendship");
    }
}