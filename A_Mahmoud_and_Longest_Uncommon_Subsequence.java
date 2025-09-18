import java.util.Scanner;

public class A_Mahmoud_and_Longest_Uncommon_Subsequence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line_a = sc.nextLine();
        String line_b = sc.nextLine();

        if(line_a.length() > line_b.length()){// nếu dãy con này lơn hơn thì lấy luôn
            System.out.println(line_a.length());
        }else if(line_b.length() > line_a.length()) {// nếu dãy con này lớn hơn thì lấy luôn
            System.out.println(line_b.length());
        }else{// nếu 2 dãy có độ dài bằng nhau thì
            if(line_a.equals(line_b)){// nếu hai dãy con giống hệt nhau thì ko thỏa mãn
                System.out.println("-1");
            }else{
                System.out.println(line_a.length());// nếu hai dãy con vừa vbanwgf nhau mà chuỗi khác nhau kí tự thì lấy độ dài của thằng nào cũng dc vì nó bằng nhau về độ dài
            }
        }
    }
}
