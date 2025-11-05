import java.util.Arrays;
import java.util.Scanner;

public class B_Your_Name {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            sc.nextLine();
            String a = sc.nextLine();
            String b = sc.nextLine();

            // sap xep chuoi
            char[] tmp_a = a.toCharArray();
            char[] tmp_b = b.toCharArray();
            Arrays.sort(tmp_a);
            Arrays.sort(tmp_b);

            a = new String(tmp_a);
            b = new String(tmp_b);

            boolean found = false;
            for(int i = 0; i < n; i++){
                if(a.charAt(i) != b.charAt(i)){
                    found = true;
                    break;
                }
            }

            if(found){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
    }
}
