import java.util.Scanner;

public class C_Odd_Even_Increments {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        //input
        input(sc, t);
        sc.close();
    }


    public static void input(Scanner sc , int t) {
        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }

            // (n + 1) / 2 là để làm trong số phần tử mà mảng có thể chứa tránh tràn mảng
            int[] ViTri_even = new int[(n + 1) /2];
            int[] ViTri_odd = new int[(n + 1) /2];

            for(int i = 0, j = 0, k = 0; i < n; i++){
                if(i % 2 == 0){
                    ViTri_even[j] = a[i];
                    j++;
                }else{
                    ViTri_odd[k] = a[i];
                    k++;
                }
            }

            //vi tri chan
            int count_even = 0;
            int count_odd = 0;
            boolean found_1 = false;
            /* vì n / 2 là làm tròn xuống nên nếu n là lẻ thì (n + 1) / 2 sẽ chẵn,
             sẽ chứa nhiều số hơn mảng lẻ ở dưới vì nếu n ban đầu chỉ chứa lẻ số phần tử,
             thì trên chia đôi ra trên sẽ phải chứa nhiều hơn;

             - còn nếu n chẵn thì khi (n + 1) / 2 vẫn sẽ thành chia đôi vs mảng lẻ bên dưới vì chẵn + 1 là lẻ,
             thì chia đôi ra vẫn được làm tròn xuống nên là 2 mảng vẫn có độ dài bằng nhau
            */
            for(int i = 0; i < (n + 1) / 2; i++){
                if(ViTri_even[i] % 2 == 0){
                    count_even++;
                }else{
                    count_odd++;
                }
            }
            if(count_odd == 0 || count_even == 0){
                found_1 = true;
            }


            //vi tri le
            int count_chan = 0;
            int count_le = 0;
            boolean found_2 = false;
            /* chỉ cần n/2 làm tròn xuống vì nếu n là lẻ thì mảng trên đã chưa nhiều hơn rồi
            nên mảng dưới chỉ cần chứa đúng n / 2 số phần tử dc làm tròn xuống
             */
            for(int i = 0; i < n / 2; i++){
                if(ViTri_odd[i] % 2 == 0){
                    count_chan++;
                }else{
                    count_le++;
                }
            }
            if(count_chan == 0 || count_le == 0){
                found_2 = true;
            }


            //in ra ket qua
            if(found_1 && found_2){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
