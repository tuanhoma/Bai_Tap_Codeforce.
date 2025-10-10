import java.util.Scanner;

public class C_Minimum_Varied_Number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            if(n <= 9){// nếu như n <= 9 thì in ra n luôn vì số là số nhỏ nhất rồi
                System.out.println(n);
            }else{// nếu n > 9
                StringBuilder tmp = new StringBuilder();// tạo string tmp để đảo dc tạo ra chuỗi số + nhỏ nhất
                int index = 9;// đặt biến để trừ đi
                while(n != 0){
                    if(n >= index){// nếu n >= index thì mới dc trừ đi và add vào tmp
                        n -= index;
                        tmp.append(index);
                    }
                    index--;// cặp nhật biến index liên tục dù có n > index và n -= index dc hay ko
                }

                System.out.println(tmp.reverse());
            }
        }
    }
}
