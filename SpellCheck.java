import java.util.Scanner;

public class SpellCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // The first line of the input contains an integer t(1≤t≤103) — the number of test cases.
        int nTestCases = scanner.nextInt();
        String output[] = new String[nTestCases];

        for (int i = 0; i < nTestCases; i++) {
            // The first line of each test case contains an integer n(1≤n≤10) — the length of string s.
            int sLength = scanner.nextInt();

            // The second line of each test case contains a string s consisting of only uppercase or lowercase Latin characters.
            String s = scanner.next();

            char[] name = {'t', 'i', 'm', 'u', 'r'};
            int upperCaseCount = 0;
            int sCheckCount = 0;

            if (sLength == s.length()) {
                for (int j = 0; j < s.length(); j++) {
                    if (Character.isUpperCase(s.charAt(j))) {
                        upperCaseCount += 1;
                    }

                    for (int k = 0; k < name.length; k++) {
                        if (s.charAt(j) == name[k]) {
                            sCheckCount++;
                            break; // Exit the loop if a match is found to avoid unnecessary iterations
                        }
                    }
                }

                if (sCheckCount == s.length() && upperCaseCount == 1) {
                    output[i] = "YES";
                } else {
                    output[i] = "NO";
                }
            } else {
                output[i] = "NO";
            }
        }

        for (String str : output) {
            System.out.print(str + " ");
        }
    }
}
