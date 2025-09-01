import java.util.Scanner;

public class A_Filling_Shapes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n % 2 != 0){// Nếu n lẻ thì luôn còn thừa 1 cột, không thể lấp → kết quả là 0.
            System.out.println(0);
        }else{//Mảnh ghép trong đề chỉ có thể lấp kín nếu n chẵn
            int result = (int)Math.pow(2, n/2);// Nếu n chẵn, mỗi lần ta xét 2 cột liền nhau (3×2), thì có 2 cách để xếp mảnh ghép
            System.out.println(result);// Như vay cặp cột, số cách = n/2. pow(2, n/2), 2 laf cặp theo công thức 2 cặp cột, còn n/2 là số cách sắp xếp nên 2 cặp cột, mũ là số cách = số cách sắp xếp cặp cột
        }
    }
}
