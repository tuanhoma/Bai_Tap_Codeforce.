import java.util.Arrays;
import java.util.Scanner;

public class B_Parity_Sort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
                b[i] = a[i];
            }
            
            /*
            là để mảng b đã sắp xếp là kết quả chuẩn sau khi sắp xếp,
            và do yêu cầu của bài là cùng lẻ hoặc chẵn mới được đổi chỗ,
            nên khi so sánh mảng đã sắp xếp với mảng ban đầu sẽ biết dc do ta dựa vào bảng đã sắp xếp nếu như sau khi đã sắp xếp chuẩn
            mà so từng ptu với mảng gốc mà cùng 1 ptu mà lại là lẻ và chẵn là sai luôn
             */
            Arrays.sort(b);
            boolean found = false;
            for(int i = 0; i < n; i++){
                if((a[i] % 2 == 0 && b[i] % 2 != 0) || (a[i] % 2 != 0 && b[i] % 2 == 0)){
                    found = true;
                    break;
                }
            }

            if(found){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }


            // Chưa tối ưu bị quá thời gian
            /*
            for(int i = 0; i < n - 1; i++){
                int tmp = a[i];
                for(int j = i + 1; j < n; j++){
                    if(tmp % 2 == 0 && a[j] % 2 == 0){
                        if(tmp > a[j]){
                            a[i] = a[j];
                            a[j] = tmp;
                            tmp = a[i];
                        }
                    }else if(tmp % 2 != 0 && a[j] % 2 != 0){
                        if(tmp > a[j]){
                            a[i] = a[j];
                            a[j] = tmp;
                            tmp = a[i];
                        }
                    }
                }
            }

            boolean found = false;
            for(int i = 0; i < n - 1; i++){
                if(a[i] > a[i + 1]){
                    found = true;
                    break;
                }
            }

            if(found){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
            */
        }
    }
}
