import java.util.Scanner;

public class A_AB_Balance {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while(t-- > 0){
            String line = sc.nextLine();
            int count_ab = 0;
            int count_ba = 0;
            for(int i = 0; i < line.length() - 1; i++){
                if(line.charAt(i) == 'a' && line.charAt(i + 1) == 'b'){
                    count_ab++;
                }else if(line.charAt(i) == 'b' && line.charAt(i + 1) == 'a'){
                    count_ba++;
                }
            }

            if(count_ba == count_ab){
                System.out.println(line);
                continue;
            }

            char[] arr = line.toCharArray();
            //vì giữa count_ab và count_ba chỉ luôn chênh lệch cao nhất là 1 nên chỉ cần đổi kí tự ở a[0] là được
            if (count_ab > count_ba) {// vì giữa count_ab và count_ba chỉ luôn chênh lệch cao nhất là 1 nên chỉ cần sửa a[0] sẽ làm 2 chuỗi con 'ab' và 'ba' có số lượng bằng nhau
                arr[0] = 'b';// nếu số lượng 'ab' > số lượng 'ba' thì phải sửa 1 chuỗi đầu
            } else {
                arr[0] = 'a';// nếu số lượng 'ba' > số lượng 'ab' thì phải sửa 1 chuỗi đầu
            }

            System.out.println(new String(arr));
        }
    }
}
