import java.util.Scanner;
public class A_Colorful_Stones_Simplified_Edition {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line_1 = sc.nextLine();
        String line_2 = sc.nextLine();

        char[] a = line_1.toCharArray();
        char[] b = line_2.toCharArray();

        int count = 1;
        for (int i = 0, j = 0; i < b.length; i++){
            if(a[j] == b[i]){
                count++;
                j++;
            }
        }

        System.out.println(count);
    }
}
