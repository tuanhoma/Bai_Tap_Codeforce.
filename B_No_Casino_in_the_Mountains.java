import java.util.Scanner;

public class B_No_Casino_in_the_Mountains {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];

            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }

            int count = 0;
            int tmp = 0;
            for(int i = 0; i < n; i++){
                if(a[i] == 0){// nếu như a[i] là 0 thì cộng số ngày lao núi
                    tmp++;
                    if(tmp == k){// nếu thỏa mãn số ngày cần thiết để leo núi
                        count++;// đã leo dc 1 ngon núi
                        tmp = 0;// đặt lại biến đếm số ngày là 0
                        i++;// nhảy qua 1 ngày vì sau khi leo núi lần nghỉ 1 ngày
                    }
                }else{// nếu a[i] == 1 là ngày xấu ko thể leo núi nên i == 0
                    tmp = 0;
                }
            }

            System.out.println(count);
        }
    }
}
