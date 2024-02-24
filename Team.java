import java.util.Scanner;
public class Team
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
        for(int i = 0 ; i < n ; i++)
        {
            int sum = 0;
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            sum=x+y+z;
            if(sum>1)
                result+=1;
        }
        System.out.println(result);
    }
}