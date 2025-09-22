import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class B_Symmetric_Encoding {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            sc.nextLine();
            String line = sc.nextLine();

            String tmp_a = "";
            HashSet<Character> map = new HashSet<>();
            for(int i = 0; i < line.length(); i++){
                if(!map.contains(line.charAt(i))){
                    map.add(line.charAt(i));
                    tmp_a += line.charAt(i);
                }
            }

            char[] b = tmp_a.toCharArray();
            Arrays.sort(b);
            tmp_a = new String(b);

            String tmp_b;
            StringBuilder a = new StringBuilder(tmp_a);
            tmp_b = a.reverse().toString();

            // Tạo ánh xạ ký tự đối xứng
            int[] maping = new int[256];
            Arrays.fill(maping, -1);
            for (int j = 0; j < tmp_a.length(); j++) {
                maping[tmp_a.charAt(j)] = tmp_b.charAt(j);// nhớ trước và giống như từ điển lưu các kí tự ngược lại của tmp_a là tmp_b khi nào tra tmp_a sẽ ánh xạ trực tiếp đến b để lấy
            }

            // Giải mã
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < n; i++) {
                result.append((char) maping[line.charAt(i)]);
            }


            System.out.println(result);
        }
    }
}
