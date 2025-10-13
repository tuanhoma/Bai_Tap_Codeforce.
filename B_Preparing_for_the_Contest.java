import java.util.Scanner;

public class B_Preparing_for_the_Contest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] a = new int[n];
            int temp = n;
            // đặt mảng ban đầu là từ lớn đến bé 5, 4, 3, 2, 1
            for(int i = 0; i < n; i++){
                a[i] = temp;
                temp--;
            }

            for(int i = 0; i < k; i++){// tùy theo k là bao nhiêu cho nổi bọt từng đó ptu
                for(int j = 0; j < n - 1; j++){
                    int tmp = a[j];
                    if(a[j] > a[j + 1]){
                        a[j] = a[j + 1];
                        a[j + 1] = tmp;
                    }
                }
            }

            for(int i = 0; i < n; i++){
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
    }
}
