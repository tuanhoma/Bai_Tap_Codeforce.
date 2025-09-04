import java.util.Arrays;
import java.util.Scanner;

public class A_Twice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];

            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }

            Arrays.sort(a);// sắp xếp
            int count = 0;
            for(int i = 0; i < n - 1; i++){
                if(a[i] == a[i + 1]){// nếu 2 ptu lien tiếp giống nhau thì nó là 1 cặp ko dc dùng nữa phải nhảy ra khỏi các ptu của cặp đó nên phải tăng indexx lên 1 nêú nó là 1 cặp bằng nhau
                    count++;
                    i++;
                }
            }

            System.out.println(count);
        }
    }
}
