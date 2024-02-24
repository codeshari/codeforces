import java.util.Scanner;
 
public class Drinks {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        double n, p;
        n = sc.nextDouble();
 
        double sum = 0;
        //getting percentage of orange for n drinks
        for(int i=0; i<n; i++) {
            p = sc.nextDouble();
            sum+=p;
        }
 
        double avg = sum/n;
 
        System.out.printf("%.5f%n",avg);
 
    }
}