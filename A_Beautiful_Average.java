import java.util.Scanner;

public class A_Beautiful_Average {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            int max = 0;

            //tìm mảng con có trugng bình lớn nhất, do vậy chỉ cần tìm ptu lắn nhất trong mảng là dc vì mảng con dc phép có 1 ptu và nếu là 1 ptu thì agv ucar nó chỉ phải chia cho 1 nên nó vẫn giữ nguyên giá trị
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
                if(a[i] > max){
                    max = a[i];
                }
            }

            System.out.println(max);
        }
    }
}
