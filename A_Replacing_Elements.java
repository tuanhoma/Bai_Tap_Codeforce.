import java.util.Arrays;
import java.util.Scanner;

public class A_Replacing_Elements {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int d = sc.nextInt();
            int[] a = new int[n];

            boolean tc = false;
            for(int i = 0; i < n; i++){// nhập từ bàn phím kiêm luôn duyệt cả mảng xem có pyu nào lớn hơn d ko
                a[i] = sc.nextInt();
                if(a[i] > d){
                    tc = true;
                }
            }

            if(tc){// nếu như có ptu lớn hơn d
                Arrays.sort(a);// sắp xếp từ bé > lớn
                boolean found = false;
                for(int i = 1; i < n; i++){
                    if(a[0] + a[i] <= d){// nếu như có 2 số cộng với nhau <= d thì thỏa mãn in yes, vì tất cả mọi số lớn hơn d đều có thẻ set giá trị thành giá trị của 2 số cộng với nhau < d này, luôn thỏa mãn điều kiện i != k, i != j, j !=k vì các số lớn ko ở vị trị index j và k thỏa mãn < d,
                        // và j thì là index là i , đặt k index là 0 nên luôn thỏa mãn điều kiện
                        found = true;
                    }
                }

                if(found){// nếu như tìm thấy 2 số cộng vs nhau <= d thì in yes
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }else{// nếu như ko có số nào > d thì in l;uôn yes
                System.out.println("YES");
            }
        }

        sc.close();
    }
}
