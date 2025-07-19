import java.util.Scanner;

public class A_Deletions_of_Two_Adjacent_Letters {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while(t-- > 0){
            String line = sc.nextLine();
            String line2 = sc.nextLine();
            char c = line2.charAt(0);

            char[] a = line.toCharArray();
            boolean found = false;

            for(int i = 0; i < a.length; i++){
                if(a[i] == c){
                    int left = i;// số lượng kí tự bên trái còn lại tính cả vị trí i hiện tại
                    int right = a.length - i - 1;// số lượng kí tự bên phải còn lại tính cả vị trí i hiện tại
                    if(left % 2 == 0 && right % 2 == 0){// nếu số lượng còn lại cả hai bên là chẵn thì có thể rút gọn còn 1 kí tự duy nhất
                        found = true;
                        break;
                    }
                }
            }

            if(found){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
