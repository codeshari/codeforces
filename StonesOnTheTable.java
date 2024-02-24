import java.util.Scanner;
 
public class StonesOnTheTable {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        Integer numberofStones = sc.nextInt();
        String stones = sc.next();
        int count = 0;
 
 
        for(int i = 0 ; i < numberofStones ; i++)
        {
            if(i != numberofStones-1)
            {
                if(stones.charAt(i) == stones.charAt(i+1))
                    count++;
            }
 
        }
        System.out.println(count);
    }
}