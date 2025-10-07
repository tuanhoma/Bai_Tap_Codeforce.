import java.util.Scanner;

public class A_Compare_TShirt_Sizes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while(t-- > 0){
            String a = sc.next();
            String b = sc.next();

            char tmp_a = a.charAt(a.length() - 1);
            char tmp_b = b.charAt(b.length() - 1);

            if(tmp_a < tmp_b){// Vì ASCII là L < M < S nhưng thứ tự kích cỡ thực tế là S < M < L, nên ta đảo dấu khi so sánh hai ký tự cuối.
                System.out.println(">");
            }else if(tmp_a > tmp_b){// Vì ASCII là L < M < S nhưng thứ tự kích cỡ thực tế là S < M < L, nên ta đảo dấu khi so sánh hai ký tự cuối.
                System.out.println("<");
            }else{// Nếu 2 kí tự cuối bằng nhau
                if(a.length() == b.length()){// nếu 2 chuỗi dài bằng nhau
                    System.out.println("=");
                }else if(tmp_a == 'S' && (a.length() > b.length())){// nếu kí tự cuối là 'S' và có thằng a > b thì in ngược lại vì xxxxS < xS
                    System.out.println("<");
                }else if(tmp_a == 'S' && (a.length() < b.length())){
                    System.out.println(">");
                }else{// nếu 2 kí tự cuối bằng nhau và ko phải trg hợp đặc biệt nhưu kí tự 'S' thì vd a> b thì in luôn > ko cần in ngược vd XXXl > XL
                    System.out.println(a.length() > b.length() ? ">" : "<");
                }
            }
        }
    }
}
