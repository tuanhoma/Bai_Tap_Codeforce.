import java.util.Scanner;

public class B_Vlad_and_Shapes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            sc.nextLine();
            String[] a = new String[n];
            int[] b = new int[n];
            int k = 0;

            for(int i = 0; i < n; i++){
                String line = sc.nextLine();
                a[i] = line;// nhaạp vào mảng
                int count = 0;
                boolean found = false;
                for(int j = 0; j < a[i].length(); j++){
                    if(a[i].charAt(j) == '1'){// nếu hàng có số 1 thì đếm số lần xuất hiện
                        found = true;
                        count++;
                    }
                }
                if(found){
                    b[k] = count;// lưu biến count vào mảng b
                    k++;
                }
            }

            boolean found = false;
            for(int i = 0; i < k - 1; i++){
                if(b[i] > b[i + 1] || b[i] < b[i + 1]){// nếu như các ptu trong mảng khác nhau thì in ra hình tam giác , còn ko thì là hình vuông
                    found = true;
                }
            }

            if(found){// ptu trong mảng khác nhau thì in ra hình tam giác
                System.out.println("TRIANGLE");
            }else{// các ptu trong mảng giống nhau thì là hình chữ nhật
                System.out.println("SQUARE");
            }
        }
    }
}
