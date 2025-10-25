import java.util.Arrays;
import java.util.Scanner;

public class A_Make_All_Equal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }

            Arrays.sort(a);
            int max = 0;
            int count = 0;
            for(int i = 0; i < n - 1; i++) {
                if (a[i] == a[i + 1]) {
                    count++;
                    if(count > max){
                        max = count;
                    }
                }else{
                    count = 0;
                }
            }

            int result = n - max - 1;// vì đang lấy cả chuỗi n - số lượng số bằng nhau mà vì điều kiện số bằng nhau là i == i + 1 thì count mới +1 nên nó sẽ bị thiếu 1 số bằng nhau nên khi độ faif mảng trừ đi số lượng số bằng nhau sẽ bị thừa ra 1, nên ta phải luôn trừ đi 1
            System.out.println(result);
        }
    }
}
