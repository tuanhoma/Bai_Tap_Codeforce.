import java.util.Scanner;

public class A_Shovels_and_Swords {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            long a = sc.nextInt();
            long b = sc.nextInt();

            if(a == 0 || b == 0){
                System.out.println("0");
            }else{
                // vì mỗi loại công cụ luôn cần 3 nguyên liệu để tạo ta nên ta có (a + b) / 3 se ra số công cụ tối đa có thể làm được
                // nhưng vì nếu như có 100 que và 1 kim cương thì khi dùng công thức trên lại khiến sai, nên ta phải giới hạn đặt trong min nếu như số que hoặc kim cương bé hơn tổng kết quả chia 3 thì phải chọn thằng min nhất
                long result = Math.min((a + b) / 3, Math.min(a, b));// chọn thằng min nhất để đảm bảo luôn đúng và ko lỗi để giới hạn theo nguyên liệu ít nhất hoặc là số sản phẩm tạo ra đúng theo yêu cầu ko vượt quá số nguyên liệu que và kim cương
                System.out.println(result);
            }
        }
    }
}
