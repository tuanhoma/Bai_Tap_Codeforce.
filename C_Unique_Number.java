import java.util.Scanner;

public class C_Unique_Number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();

            if(n > 45){
                System.out.println("-1");
            }else{
                String result = "";
                int i = 9;
                while (n > 0 && i > 0) {
                    if (n >= i) {
                        n -= i;
                        result += "" + i;
                    }
                    i--;
                }

                StringBuilder st = new StringBuilder(result);
                st.reverse();
                result = st.toString();
                System.out.println(result);
            }
        }
    }
}
