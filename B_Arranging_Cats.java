import java.util.Scanner;

public class B_Arranging_Cats {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            sc.nextLine();

            String line1 = sc.nextLine();
            String line2 = sc.nextLine();
            int count_line1 = 0;
            int count_line2 = 0;
            for(int i = 0; i < n; i++){
                if(line1.charAt(i) == '0' && line2.charAt(i) == '1'){
                    count_line1++;//cần thêm mèo hoặc chuyển mèo đến
                }
                if(line1.charAt(i) == '1' && line2.charAt(i) == '0'){
                    count_line2++;//cần xóa mèo hoặc chuyển mèo đi
                }
            }

            int result = Math.max(count_line1, count_line2);// chọn xem cái bươcs nào nhiều hơn, vì bước nhỏ hơn đã thuộc là tập con của phần lớn hơn nên ta sẽ lấy phần dư ra

            System.out.println(result);
        }
    }
}
