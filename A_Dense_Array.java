import java.util.Scanner;

public class A_Dense_Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }

            int count = 0;
            for(int i = 0; i < n - 1; i++){
                // ép kiểu double khi chia nếu ko chia kiểu int nó sẽ làm trong xuống khiến bị lỗi khi đếm vd: 46 / 16 = 2 khi chia kiểu int, nhưng thật là nó là 2,6 nên nếu ko ép kiểu double nó sẽ khiến chương trình sai
                if(((double)a[i + 1] / a[i] > 2) || ((double)a[i] / a[i + 1] > 2)){// nếu 2 số liên tiếp chia nhau là > 2 thì cần tìm trong đoạn đó phải chèn bao nhiêu số để thỏa mãn điều kiện
                    int tmp_max = Math.max(a[i + 1], a[i]);// tìm ptu max
                    int tmp_min = Math.min(a[i + 1], a[i]);// lấy ptu min
                    // xem cần chèn bao nhiêu ptu giữa đoạn đó để thỏa mãn
                    while(tmp_min * 2 < tmp_max){// phải kiểm tra tmp_min * 2 < tmp_max nếu ko nó sẽ đếm thừa lần đầu tien khi vào vòng lặp, nó đếm thừa lần chưa nhân gì là đếm nhầm số ko phải số chèn
                        count++;
                        tmp_min *= 2;
                    }
                }
            }

            System.out.println(count);
        }
    }
}
