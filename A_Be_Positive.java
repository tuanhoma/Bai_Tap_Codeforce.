import java.util.Scanner;

public class A_Be_Positive {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];

            int count_am = 0;// đếm số lượng số âm
            int count_zero = 0;// đếm số lượng số 0
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
                if(a[i] < 0){
                    count_am++;
                }
                if(a[i] == 0){
                    count_zero++;
                }
            }

            int result = 0;
            if(count_am % 2 != 0){// nếu số lượng số -1 là lẻ thì ta nhân tất cả -1 vào với nhau sẽ vẫn ra -1 và ta chỉ cần +2 là nó sẽ dương != 0, và cộng với số lượng số 0 là số lượng cần tâng thêm 1 để tránh nhân ra 0
                result = 2 + count_zero;
            }else{
                result = count_zero;// nếu số lượng số âm -1 là chẵn thì luôn nhân ra số dương còn số, nên ta chỉ cần lấy số lượng số 1 + vào 0 để thỏa mãn nhân tất cả ptu trong mảng ko âm
            }

            System.out.println(result);
        }
    }
}
