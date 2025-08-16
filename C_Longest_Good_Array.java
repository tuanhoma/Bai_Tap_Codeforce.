import java.util.Scanner;

public class C_Longest_Good_Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();

            int d = b - a;
            int k = 0;
            while(true){
                if(((k - 1) * k) / 2 > d){// (k - 1) * k) / 2 công thức tính tổng, điều kiện < d là để đảm bao số lượng ptu nằm trong đoạn từ l đến r
                    break;
                }else{
                    k++;// là số lớn nhất để tổng tất cả các số của nó tạo ra mảng nhiều ptu nhất nằm trong đoạn r và l và thỏa mãn các nhau là nhiệu tăng dần
                }
            }

            System.out.println(k - 1);
        }
    }
}
