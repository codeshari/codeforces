import java.util.Scanner;
 
public class BeautifulYear {
    static boolean beautifulYear(int year) {
        String strYear = Integer.toString(year);
        int flag = 0, check = 0;
 
        for(int i = 0; i<strYear.length(); i++) {
            for (int j = 0; j<strYear.length(); j++) {
                if(i!=j) {
                    if(strYear.charAt(i) == strYear.charAt(j)) {
                        flag++;
                    }
                }
            }
            if(flag>0) {
                check+=1;
            }
        }
        if(check == 0)
            return true;
        return false;
    }
 
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int year = scan.nextInt();
        year += 1;
 
        while(true) {
            if(beautifulYear(year)){
                System.out.println(year);
                break;
            }
            year++;
        }
    }
}