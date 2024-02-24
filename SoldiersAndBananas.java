import java.util.Scanner;
 
public class SoldiersAndBananas {
 
    public static void main(String[] args) {
 
        //k - amount of dollar to pay for a single banana. - firstBananaCost
        //n - dollars that the soldier already have. - dollarsIHave
        //w - number of bananas. - bananas
 
        Scanner sc = new Scanner(System.in);
        int dollarstoBorrow = 0;
 
        int firstBananaCost = sc.nextInt();
        int dollarsIHave = sc.nextInt();
        int bananas = sc.nextInt();
        int bill = 0;
 
        for(int i = 1 ; i <= bananas ; i++)
            bill+=(i*(firstBananaCost));
 
        if(dollarsIHave<=bill)
        {
            dollarstoBorrow = bill - dollarsIHave;
            System.out.println(dollarstoBorrow);
        }
        else
            System.out.println(dollarstoBorrow);
 
 
    }
}