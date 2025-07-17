import java.util.Scanner;

public class A_Deletions_of_Two_Adjacent_Letters {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            String line = sc.nextLine();
            char c = sc.next().charAt(0);

            char[] a = line.toCharArray();
            boolean found = false;

            for(int i = 0; i < a.length; i++){
                if(a[i] == c){
                    int left = i;// số lượng kí tự bên trái còn lại trước a[i]
                    int right = a.length - i - 1;// số lượng kí tự bên phải còn lại sau vị trí a[i]
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
