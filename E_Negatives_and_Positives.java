import java.util.Scanner;

public class E_Negatives_and_Positives {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            int count = 0;
            long min = 1000000000;
            long sum = 0;
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
                if(a[i] < 0){// đếm số lượng số âm
                    count++;
                }
                if(Math.abs(a[i]) < min){
                    min = Math.abs(a[i]);// tìm min giá trị tuyệt đối gần với 0 nhất
                }
                sum += Math.abs(a[i]);// tổng giá trị tuyệt đối tất cả ptu trong mảng
            }

            if(count % 2 == 0){// nếu như số lượng số âm là chẵn thì luôn có cách để đổi các số âm thành số chẵn
                System.out.println(sum);
            }else{// nếu như số lượng số âm là lẻ thì ko thể đổi tất cả thành số chẵn được sẽ thừa ra 1 số âm, và ta sẽ chuyển đổi số âm đấy là số nhất gần về 0 nhất.
                System.out.println(sum - (2 * min));
            }
        }
    }
}
