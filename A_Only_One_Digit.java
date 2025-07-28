import java.util.Scanner;

public class A_Only_One_Digit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while(t-- > 0){
            String line = sc.nextLine();
            char[] a = line.toCharArray();// chuyển chuỗi vào mảng để tìm số nhỏ nhất trong chuỗi
            int result = 10000;

            for(int i = 0; i < a.length; i++){
                if(a[i] - '0' < result){// tìm số nhỏ nhất trong chuỗi
                    result = a[i] - '0';
                }
            }

            System.out.println(result);// in ra số nhỏ nhất trong chuỗi
        }

        sc.close();
    }
}
