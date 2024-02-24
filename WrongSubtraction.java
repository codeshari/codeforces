import java.util.Scanner;
 
public class WrongSubtraction {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int times = sc.nextInt();
 
        for(int i = 0 ; i < times ; i++)
        {
            if((number%10) == 0)
                number/=10;
            else
                number-=1;
        }
        System.out.println(number);
 
    }
}