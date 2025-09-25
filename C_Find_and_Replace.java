import java.util.HashMap;
import java.util.Scanner;

public class C_Find_and_Replace {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            sc.nextLine();
            String line = sc.nextLine();
            char[] a = line.toCharArray();

            HashMap<Character, Integer> map = new HashMap<>();
            int i = 0;
            for(Character c : a){// gán mỗi ký tự nếu như ở vị trí chẵn là 0, lẻ là 1
                if(i % 2 == 0){
                    map.put(a[i], 0);
                }else{
                    map.put(a[i], 1);
                }
                i++;
            }

            // gán 0 và 1 vào mảng
            int[] b = new int[a.length];
            for(int j = 0; j < a.length; j++){
                b[j] = map.get(a[j]);
            }

            // duyệt qua nếu như là 2 số liền nhau giống nhau thì sai
            boolean found = false;
            for(int j = 0; j < n - 1 ; j++){
                if(b[j] == b[j + 1]){
                    found = true;
                    break;
                }
            }

            // Tổng kết tóm lại là vì ta đã gán mỗi kí tự ở vị trí chẵn lẻ là 0 hoặc 1 để cho nó luôn dc xen kẽ nếu như trùng giá trị 0 1 thì sai, vì nếu ta đã gán ký tự đó ở vị trí chẵn là 0 nếu nó xuất hiện lại ở vị trí lẻ thì luôn sai các kí tự phải luôn ở vị trí chẵn hoặc lẻ ko dc khác nhau vì ta đã xác định 0 hoặc 1 xen kẽ nếu như xuất hiện chẫn rồi lẻ thì bị trùng thằng khác
            if(found){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
    }
}
