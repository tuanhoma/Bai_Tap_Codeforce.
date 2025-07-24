import java.util.Scanner;

public class B_Journey {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int sum = 0;
            int count = 0;

            int[] steps = {a, b, c};
            int sum3 = a + b + c;

            int fullCycles = n / sum3;// mục tiêu km / số km đi dc trong 3 ngày sẽ dc số lượng chu kì cần để hoàn thành mục tiêu, mỗi chu kì sẽ là số km đi dc trong 3 ngày
            int totalKm = fullCycles * sum3;// tổng số km cần thiết đi dc là số chu kì cần * tổng của km đi dc của 1 chu kì
            int day = fullCycles * 3;// số ngày cần thiết để hoàn thành mục tiêu km

            for (int i = 0; i < 3 && totalKm < n; i++) {// bước này để tính số km còn thiếu trong 1 chu kì
                totalKm += steps[i];// mỗi bước để cộng thêm số km đi dc trong 1 ngày để tính nốt số km còn thiếu
                day++;
            }

            System.out.println(day);
        }
    }
}
