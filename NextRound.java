import java.util.*;

public class NextRound {

    public static int getElementAtPosition(Set<Integer> set, int position) {
        if (position < 0 || position >= set.size()) {
            throw new IllegalArgumentException("Invalid position");
        }

        List<Integer> list = new ArrayList<>(set);
        return list.get(position);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Getting inputs
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int result = 0;
        int scores[] = new int[n];

        for (int i = 0; i < n; i++) {
            scores[i] = scanner.nextInt();
            if(scores[i] == 0) {
                result+=1;            }
        }

        if(result == n) {
            System.out.println(0);
            
        } else {
            for(int i = 0; i < scores.length; i++) {
                if(scores[i] >= scores[k-1] && scores[i] != 0) {
                    result++;
                }
            }

            System.out.println(result);
        }
    }
}

/*----------------------------------------------------------------
In else block:

            // int[] scoresArray = scores;

            //Identifying the kth rank score
            // Arrays.sort(scores);

            // Set<Integer> uniqueDigits = new HashSet<Integer>();

            // for (int i = 0; i < n; i++) {
            //         uniqueDigits.add(scores[i]);
            // }

            // int checkScore = getElementAtPosition(uniqueDigits, uniqueDigits.size() - (k));

            //Identifying the number of students secured more than kth score.
----------------------------------------------------------------*/