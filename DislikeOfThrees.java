import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class DislikeOfThrees {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        int noOfInputs = sc.nextInt();
        List<Integer> inputArr = new ArrayList<>();
 
        //Gets individual inputs and store it in an array called inputArr.
        for(int i = 0 ; i < noOfInputs ; i++)
            inputArr.add(sc.nextInt());
 
        int max = inputArr.get(0);
 
        for(int i = 1 ; i < noOfInputs ; i++) {
            if(inputArr.get(i)>max)
                max=inputArr.get(i);
        }
 
        List<Integer> source = new ArrayList<>();
 
        int count = 0;
        for(int i = 1 ; count<=max ; i++)
        {
            if(i%3 != 0 && i%10 != 3)
            {
                source.add(i);
                count++;
            }
 
        }
 
        for(int i = 0 ; i < inputArr.size() ; i++)
            System.out.println(source.get(inputArr.get(i)-1));
    }
}