import java.util.Scanner;

public class A_False_Alarm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] a = new int[n];

            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }

            boolean found_a = false;
            boolean found_b = false;
            int index_a = 0;
            int index_b = 0;
            for(int i = 0, j = n - 1; i < n; i++, j--){// thuật toán tham lam tìm đoạn có bắt đầu là 1 và kết thúc là 1
                if(a[i] == 1 && !found_a){
                    index_a = i;
                    found_a = true;
                }

                if(a[j] == 1 && !found_b){
                    index_b = j;
                    found_b = true;
                }
            }


            // đếm đoạn vừa cắt ra xem có bao nhiêu phần tử trong mảng đếm cả số 0 và 1
            int count = 0;
            for(int i = index_a; i <= index_b; i++){
                count++;
            }

            if(count > x){// nếu như số ptu nhiều hơn x thì ko thể đúng dc
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
    }
}
