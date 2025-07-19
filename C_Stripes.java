import java.util.Scanner;

public class C_Stripes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        //ĐỀ BÀI YÊU CẦU
        //Có một hàng ngang nào đó chứa toàn bộ là 'R' ⇒ In ra "R"
        //Có một cột dọc nào đó chứa toàn bộ là 'B' ⇒ In ra "B"
        while(t-- > 0){
            sc.nextLine();// bỏ đọc dòng trắng giữa các TC do đề bài yêu cầu, nếu ko có sẽ bị lỗi
            char[][] a = new char[8][8];
            boolean found = false;

            for(int i = 0; i < 8; i++){
                String line = sc.nextLine();
                if(line.equals("RRRRRRRR")){
                    found = true;
                }
            }

            if(found){
                System.out.println("R");
            }else{
                System.out.println("B");
            }
        }
    }
}
