import java.util.Scanner;

public class B_Rudolf_and_121 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            int sum = 0;
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
                sum += a[i];
            }

            if(sum % 4 == 0){
                boolean found = false;
                // mục tiêu là giảm ptu hiện tại về 0, là các ptu a[i + 1] và a[i + 2] giảm cùng theo quy tắc mà bị âm thì sẽ luôn sai
                for(int i = 0; i < n - 2; i++){
                    int tmp = a[i];
                    // phần này đề giảm a[i] về 0
                    a[i] = tmp - a[i];
                    a[i + 1] = a[i + 1] - tmp*2;// giảm a[i] * 2
                    a[i + 2] = a[i + 2] - tmp;// trừ đi a[i]
                    if(a[i + 1] < 0 || a[i + 2] < 0){// nếu a[i + 1] và a[i + 2] < 0 thì sẽ ngắt ngay
                        found = true;
                        break;
                    }
                }
                if(found){// nếu như có số âm thì in no
                    System.out.println("NO");
                }else if(a[n - 1] == 0 && a[n - 2] == 0){// nếu 2 số cuối cùng sau khi giảm hết thì 2 ptu cuối cùng == 0 thì là đúng
                    System.out.println("YES");
                }else{// nếu != 0 thì in no
                    System.out.println("NO");
                }
            }else{// nếu tổng ko chia hết cho 4 thì in no
                System.out.println("NO");
            }
        }
    }
}
