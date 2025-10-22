import java.util.Scanner;

public class A_Question_Marks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            sc.nextLine();
            int[] a = new int[4];
            String line = sc.nextLine();
            for(int i = 0; i < line.length(); i++) {
                if (line.charAt(i) == 'A') {
                    a[0]++;
                } else if (line.charAt(i) == 'B') {
                    a[1]++;
                } else if (line.charAt(i) == 'C') {
                    a[2]++;
                } else if (line.charAt(i) == 'D') {
                    a[3]++;
                }
            }

            int result = 0;
            for (int i = 0; i < 4; i++) {
                result += Math.min(a[i], n);// += số lần xuất hiện kí tự hoặc n lần yêu cầu xuất hiện
            }// với dấu ? thì bỏ qua vì nó dc xác định là luôn ko thể nào đúng

            System.out.println(result);
        }
    }
}
