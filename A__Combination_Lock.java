import java.util.Scanner;

public class A__Combination_Lock {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String line1 = sc.nextLine();
        String line2 = sc.nextLine();

        int count = 0;
        for(int i = 0; i < n; i++){
            int i_1 = line1.charAt(i) - '0';
            int i_2 = line2.charAt(i) - '0';
            int min = ((i_1 < i_2) ? i_1 : i_2) + 10;// tìm số bước nhỏ nhất khi đi ngược lại
            int max = (i_1 > i_2) ? i_1 : i_2;// tìm số bước khi đi từ bé đến lớn
            count += (min - max) < Math.abs(i_1 - i_2) ? (min - max) : Math.abs(i_1 - i_2);// chọn nên đi vòng ngược lại hay là đi thảng từ bé đến lớn sẽ tối ưu số lần đi hơn
        }
        System.out.println(count);
    }
}
