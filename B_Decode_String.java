import java.util.Scanner;

public class B_Decode_String {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            char[] a = "abcdefghijklmnopqrstuvwxyz".toCharArray();

            StringBuilder result = new StringBuilder();
            for(int i = b.length() - 1; i >= 0; i--){
                StringBuilder tmp = new StringBuilder();
                if(b.charAt(i) == '0'){
                    tmp.append(b.charAt(i - 2));
                    tmp.append(b.charAt(i - 1));
                    i -= 2;
                    int temp = Integer.parseInt(tmp.toString());
                    result.append(a[temp - 1]);
                }else{
                    int temp = b.charAt(i) - '0';
                    result.append(a[temp - 1]);
                }
            }

            result.reverse();
            String line = result.toString();
            System.out.println(line);
        }
    }
}
