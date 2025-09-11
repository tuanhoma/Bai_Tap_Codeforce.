import java.util.Scanner;

public class A_Dr_TC {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            sc.nextLine();
            String line = sc.nextLine();
            int count = 0;

            for(int i = 0; i < n; i++){
                char[] a = line.toCharArray();
                if(a[i] == '0'){
                    a[i] = '1';
                }else{
                    a[i] = '0';
                }
                for(int j = 0; j < n; j++){
                    if(a[j] == '1'){
                        count++;
                    }
                }
            }

            System.out.println(count);
        }
    }
}
