import java.util.Scanner;

public class B_Comparison_String {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        //input
        input(sc, t);
        sc.close();
    }

    public static void input(Scanner sc, int t) {
        while(t-- > 0){
            int n = sc.nextInt();
            sc.nextLine();
            String line = sc.nextLine();
            char[] a = line.toCharArray();
            int count = 0;
            int max = 0;
            for(int i = 0; i < a.length; i++){
                if(a[i] == '<'){// tìm chuỗi lặp lại liên tiếp nhiều nhất
                    count++;
                    if(count > max){
                        max = count;
                    }
                }else{
                    count = 0;
                }
            }

            int count1 = 0;
            int max2 = 0;
            for(int i = 0; i < a.length; i++){
                if(a[i] == '>'){
                    count1++;
                    if(count1 > max2){
                        max2 = count1;
                    }
                }else{
                    count1 = 0;
                }
            }

            int result = Math.max(max + 1, max2 + 1);
            // xem đâu là chuỗi lặp lại liên tiếp dài nhất + 1 thì đó chính là số lượng số cần để thỏa mãn sắp xếp
            System.out.println(result);
        }
    }
}
