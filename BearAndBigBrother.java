import java.util.Scanner;
 
public class BearAndBigBrother {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        int limak = sc.nextInt();
        int bob = sc.nextInt();
        int control = 0;
        int count = 0;
 
        for(int i = 1 ; control==0 ; i++)
        {
            limak*=3;
            bob*=2;
            if(limak>bob)
            {
                System.out.println(i);
                control++;
            }
        }
    }
}