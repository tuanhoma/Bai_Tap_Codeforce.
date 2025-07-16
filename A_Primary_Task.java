import java.util.Scanner;
public class A_Primary_Task {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        //input
        input(sc, t);
        sc.close();
    }

    public static void input(Scanner sc, int t) {
        while(t-- > 0){
            String line = sc.nextLine();
            char[] a = line.toCharArray();

            if (line.startsWith("10") && line.length() >= 3 && line.charAt(2) != '0') {
                String result = line.substring(2);
                int num = Integer.parseInt(result);
                if (num >= 2) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else {
                System.out.println("NO");
            }

        }
    }
}
