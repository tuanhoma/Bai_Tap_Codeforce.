import java.util.Scanner;

public class A_Morning_Sandwich {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();

            int tmp = a + b;
            int count = 0;
            int i = 0;
            while(n != 0 && tmp != 0){
                if(i % 2 == 0){
                    n--;// trừ đi số lát bánh mì
                }else{
                    tmp--;// trừ đi số lát thịt nguội và phô mai
                    if(tmp == 0 && n > 0){// nếu sau khi hết thịt nguội và phô mai, thì thêm 1 lát bánh mì ở cuối để kết thúc
                        count++;
                    }
                }
                count++;
                i++;
            }

            System.out.println(count);
        }
    }
}
