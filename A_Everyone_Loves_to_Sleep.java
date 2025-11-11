import javax.security.sasl.SaslClient;
import java.util.Arrays;
import java.util.Scanner;

public class A_Everyone_Loves_to_Sleep {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int h = sc.nextInt();
            int m = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++){
                int tmp_a = sc.nextInt();
                int tmp_b = sc.nextInt();
                a[i] = (tmp_a * 60) + tmp_b;
            }

            Arrays.sort(a);
            int tmp = (h * 60) + m;
            int temp = 0;
            boolean found = false;
            boolean found1 = false;
            for(int i = 0; i < n; i++){
                if(tmp == a[i]){// nếu giờ ngủ và báo thức bằng nhau thì break;
                    found1 = true;
                    break;
                }

                if(tmp < a[i]){// lấy báo thức gần nhât với giờ đi ngủ
                    temp = a[i];
                    found = true;
                    break;
                }
            }

            if(found1){
                System.out.println("0 0");
                continue;
            }

            if(found){// nếu như tìm được giờ báo thức lớn hơn giờ đi ngủ
                int result = temp - tmp;
                int print1 = (int)Math.floor((double)result / 60);
                int print2 = result - (print1 * 60);
                System.out.println(print1 + " " + print2);
            }else{// nếu giờ đi ngủ lớn hơn hết giờ báo thức
                int tmp2 = 1440 - tmp;// số giờ còn lại trong ngày
                int index = a[0];// giờ báo thức của ngày hôm sau

                int result = tmp2 + index;// số lượng số còn lại hôm qua + với giờ báo thức hôm nay
                int print1 = (int)Math.floor((double)result / 60);// sso giờ ngủ
                int print2 = result - (print1 * 60);// số phút ngủ
                System.out.println(print1 + " " + print2);
            }
        }
    }
}
