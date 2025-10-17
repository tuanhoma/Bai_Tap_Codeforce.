import java.util.HashSet;
import java.util.Scanner;

public class B_Remove_Prefix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }

            HashSet<Integer> map = new HashSet<>();// tạo 1 HashSet để lưu các kí tự riêng biệt
            int tmp = -1;
            for(int i = n - 1; i >= 0; i--){
                if(map.contains(a[i])){// nếu gặp lại ptu đó mà có trong set tức là trùng, đi từ cuỗi mảng đến đầu
                    tmp = i;
                    break;
                }
                map.add(a[i]);
            }

            if(tmp == -1){// nếu ko có ptu trung thì in 0 ko phải bỏ ptu nào cả
                System.out.println("0");
            }else{
                System.out.println(tmp + 1);// in ra vị trí indẽx đã break ở trên và từ 0 đến vị trí đó có bao nhiêu ptu cần cắt
            }
        }
    }
}
