import java.util.Scanner;

public class B_Choosing_Cubes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int f = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];

            int count_larger = 0;
            int count_f = 0;

            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            int tmp = a[f - 1];

            for(int i = 0; i < n; i++){
                if(a[i] > tmp){
                    count_larger++;// Đếm số lượng khối có giá trị lớn hơn khối yêu thích
                }
                if(a[i] == tmp){
                    count_f++;// Đếm số lượng khối có cùng giá trị với khối yêu thích
                }
            }


            int maybe = count_larger + count_f - 1;// đây là số lượng ptu trùng với f và + với số lớn hơn f, nếu như k <= maybe - 1 thì 1 phần khối yêu thích nằm trong k 1 phần ngoài k thì sẽ in ra MAYBE
            if(k <= count_larger){// Nếu số khối bị loại (k) nhỏ hơn hoặc bằng số khối lớn hơn khối yêu thích → khối yêu thích chắc chắn không nằm trong top k, → in "NO".
                System.out.println("NO");
            }else if(k <= maybe){// Nếu k nằm trong vùng có thể chạm tới khối yêu thích trong nhóm bằng nhau → có thể bị loại hoặc không → "MAYBE".
                System.out.println("MAYBE");
            }else{// Nếu k > số khối chắc chắn đứng trước + số khối có thể đứng trước (tức chắc chắn khối yêu thích nằm trong top k) → luôn bị loại → "YES".
                System.out.println("YES");
            }

        }
        sc.close();
    }
}
