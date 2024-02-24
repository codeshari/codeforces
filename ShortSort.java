import java.util.Scanner;
 
public class ShortSort {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        String[] options = new String[n];
        String val = new String("abc");
 
        //getting string inputs from the user.
        for(int i=0; i<n; i++) {
            options[i] = sc.next();
        }
 
        for(int i=0; i<n; i++) {
            if(options[i].equals(val)) {
                System.out.println("YES");
            } else {
                boolean isTrue = false;
                for(int j=0; j<options[i].length(); j++) {
                    int a = j;
                    int b = (a>1) ? 0 : a+1;
                    char ch[] = options[i].toCharArray();
                    char temp = ch[a];
                    ch[a] = ch[b];
                    ch[b] = temp;
                    String str = new String(ch);
                    if(str.equals(val)) {
                        isTrue = true;
                    }
                }
                if(isTrue) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}