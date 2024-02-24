import java.util.Scanner;
 
public class BinaryImbalance {
    
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
 
        int n = sc.nextInt();
        int nStr;
        String str;
        String arr[] = new String[n];
 
 
        for (int i=0; i<n; i++) {
 
            nStr = sc.nextInt();
            str = sc.next();
            int flag = 0;
            for(int j=0; j<nStr; j++) {
                if(str.charAt(j) == '0') {
                    flag+=1;
                }
            }
            if(flag>0) {
                arr[i] = "YES";
            } else {
                arr[i] = "NO";
             }
        }
 
        for(int i = 0; i<n; i++) {
            System.out.println(arr[i]);
        }
 
    }
}