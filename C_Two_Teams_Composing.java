import java.util.*;

public class C_Two_Teams_Composing {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];

            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }

            Set<Integer> unique = new HashSet<>();// sô lượng ptu khác nhau
            for(int num : a){
                unique.add(num);
            }

            Map<Integer, Integer> freq = new HashMap<>();

            for(int num : a){
                freq.put(num, freq.getOrDefault(num, 0) + 1);
            }

            // Tìm phần tử xuất hiện nhiều nhất
            int maxFreq = 0;// số lần xuất hiện lặp lại nhiều nhất
            int maxValue = -1;
            for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
                if (entry.getValue() > maxFreq) {
                    maxFreq = entry.getValue();
                    maxValue = entry.getKey();
                }
            }

            int result = Math.min(unique.size(), maxFreq);
            if(unique.size() == maxFreq){
                System.out.println(result - 1);
            }else{
                System.out.println(result);
            }
        }
    }
}
