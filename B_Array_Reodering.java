import java.util.Scanner;

public class B_Array_Reodering {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }

            bubbleSort(a);

            int count = 0;
            for(int i = 0; i < n; i++){// burt force để tìm cặp liên tiếp gcd với điều kiện i < j thỏa mãn điều kiện
                for(int j = i + 1; j < n; j++){
                    int tmp = gcd(a[i], 2 * a[j]);
                    if(tmp > 1){
                        count++;
                    }
                }
            }

            System.out.println(count);
        }
    }

    public static int gcd(int a, int b){// tìm ước chung lớn nhất
        while(b != 0){
            int temp = a % b;
            a = b;
            b = temp;
        }

        return a;
    }

    public static void bubbleSort(int[] a){// sắp xếp số chẵn đứng đầu tiên
        for(int i = 0; i < a.length - 1; i++){
            for(int j = 0; j < a.length - i - 1; j++){
                int tmp = a[j];
                if(a[j] % 2 != 0){
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                }
            }
        }
    }
}
