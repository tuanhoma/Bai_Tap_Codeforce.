import java.util.Scanner;

public class B_Robin_Hood_and_the_Major_Oak {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            long n = sc.nextInt();
            long k = sc.nextInt();
            long result = 0;

            //→ Nghĩa là chỉ những lá mọc trong các năm từ (n - k + 1) đến n là còn trên cây.
            //Còn những lá mọc trước đó (năm nhỏ hơn n - k + 1) thì đã rụng rồi.
            for(long i = n - k + 1; i <= n; i++){
                result += i;// đây sẽ là tổng số lá còn lại trên cây
            }

            if(result % 2 == 0){// kiểm tra tổng còn lạ là chẵn hay lẻ
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
