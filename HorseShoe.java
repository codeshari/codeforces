import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
 
public class HorseShoe {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        List<Integer> inputs = new ArrayList<>();
 
        for (int i = 0 ; i < 4 ; i++)
            inputs.add(sc.nextInt());
 
        List<Integer> uniqueInputs
                = inputs.stream().distinct().collect(
                Collectors.toList());
 
        if(uniqueInputs.size() == 1)
            System.out.println(3);
        else if(uniqueInputs.size() == 2)
            System.out.println(2);
        else if(uniqueInputs.size() == 3)
            System.out.println(1);
        else if(uniqueInputs.size() == 4)
            System.out.println(0);
 
    }
}