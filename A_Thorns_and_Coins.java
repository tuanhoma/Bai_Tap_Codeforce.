import java.util.Scanner;

public class A_Thorns_and_Coins {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while(t-- > 0){
            int n = sc.nextInt();
            sc.nextLine();
            String line = sc.nextLine();

            int index = 0;
            String tmp = line;// đầu tiên gán string tmp = line

            boolean found = false;// duyệt vòng for xem tìm thấy ko
            for(int i = 0; i < n - 1; i++){
                if(line.charAt(i) == '*' && line.charAt(i + 1) == '*'){
                    found = true;
                    index = i;
                    break;
                }
            }

            if(found){// nếu như tìm thấy thì gán string tmp = substring
                tmp = line.substring(0, index);
            }

            // đếm số kí tự @ trong chuỗi tmp
            int count = 0;
            for(int i = 0; i < tmp.length(); i++){
                if(tmp.charAt(i) == '@'){
                    count++;
                }
            }

            System.out.println(count);
        }
    }

}
