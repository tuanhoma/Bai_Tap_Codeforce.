import java.util.Scanner;

public class A_Sasha_and_Array_Coloring {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];

            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }

            for(int i = 0; i < n - 1; i++){
                for(int j = 0; j < n - i - 1; j++){
                    int temp = a[j];
                    if(a[j] > a[j + 1]){
                        a[j] = a[j + 1];
                        a[j + 1] = temp;
                    }
                }
            }

            int result = 0;
            for(int i = 0; i < n/2; i++){// n/2 là làm tròn xuống là nếu số lượng phần tử trong mảng là lẻ thì sẽ chỉ xét các số lượng phần tử bé nhất n / 2 làm tròn xuống
                result += a[n - i - 1] - a[i];// tổng giá trị max - min trong mảng nếu chiwa thành 2 nhóm
            }

            System.out.println(result);
        }

        sc.close();
    }
}
