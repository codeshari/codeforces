    import java.util.Scanner;

    public class DominoPiling {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            int row = scanner.nextInt();
            int column = scanner.nextInt();
            System.out.println ((row * column)/2);
        }
    }