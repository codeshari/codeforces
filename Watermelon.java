import java.util.Scanner;
public class Watermelon
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int x = sc.nextInt();
        if(x!=2 && x%2==0)
            System.out.print("YES");
        else
            System.out.print("NO");
    }
}