import java.util.HashSet;
import java.util.Scanner;

public class A_Problem_solving_Log {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            sc.nextLine();
            String line = sc.nextLine();
            HashSet<Character> map = new HashSet<>();// lưu riêng biệt các kí tự 1 lần kể cả nó có lặp
            for(int i = 0; i < n; i++){
                if(!map.contains(line.charAt(i))){
                    map.add(line.charAt(i));
                }
            }

            int count = 0;
            for(Character s : map){// duyệt qua từng kí tự riêng biệt dc lưu trong hashset
                int tmp = 0;
                for(int j = 0; j < n; j++){// đếm số lần xuất hiện của các kí tự
                    if(s == line.charAt(j)){
                        tmp++;
                    }
                }
                int temp = s - 64;// xem số phút của bài toán đó
                if(tmp >= temp){// nếu như số lần giải bài toán đó >= số phút cần để giải bài toán đó thì thỏa mãn
                    count++;
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}
