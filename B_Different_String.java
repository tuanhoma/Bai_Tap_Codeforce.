import java.util.Arrays;
import java.util.Scanner;
public class B_Different_String {

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
            String line = sc.nextLine();
            char[] a = line.toCharArray();

            boolean found = true;
            for(int i = 0; i < line.length(); i++){
                if(a[0] != a[i]){
                    found = false;
                    break;
                }
            }
            if(!found){
                System.out.println("YES");
                Arrays.sort(a);// dùng đê sắp xếp chuỗi theo thứ tự alphabet
                if(new String(a).equals(line)) {// so sánh hai chuỗi với nhau
                    char temp = a[0];
                    a[0] = a[line.length() - 1];
                    a[line.length() - 1] = temp;
                    System.out.println(a);
                }else{
                    System.out.println(a);
                }
            }else{
                System.out.println("NO");
            }
        }
    }
}
