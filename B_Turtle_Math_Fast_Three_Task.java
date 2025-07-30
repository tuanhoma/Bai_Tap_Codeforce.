import java.util.Scanner;

public class B_Turtle_Math_Fast_Three_Task {

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

            int count_1 = 0;
            int count_2 = 0;
            int tmp_1 = sum;
            if(sum % 3 == 0){
                System.out.println("0");
            }else{
                while(true){// tăng liên tục để xem tăng bao nhiêu thì chia hết cho 3 nhiều nhất là tăng 2 lần
                    if(tmp_1 % 3 != 0){
                        tmp_1++;
                        count_1++;
                    }
                    if(tmp_1 % 3 == 0){
                        break;
                    }
                }

                boolean found = false;
                for(int i = 0; i < n; i++){// duyệt qua xem có thể xóa dc 1 ptu nào để khiến tổng của mảng chia hết cho 3 ko, chỉ cần duyệt 1 lần vì 2 lần là ko tối ưu vì ở bước trên cộng 2 lần đã chia hết cho 3 rồi
                    if((sum - a[i]) % 3 == 0){
                        count_2++;
                        found = true;
                        break;
                    }
                }

                if(found){// nếu như xóa 1 ptu trong mảng làm chia hết cho 3 thì in ra
                    System.out.println(count_2);
                }else{// nếu như ko xóa dc ptu trong mảng thì in ra số giá trị cần cộng nhiều nhất là 2 lần cộng giá trị
                    System.out.println(count_1);
                }
            }
        }
    }
}
