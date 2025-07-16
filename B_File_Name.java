import java.util.Scanner;

public class B_File_Name {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String line = sc.nextLine();

        char[] a = line.toCharArray();

        int count = 0;
        int result = 0;
        for(int i = 0; i < n; i++){
            if(a[i] == 'x'){
                count++;
                if(count > 2){
                    result++;
                }
            }else{
                count = 0;
            }
        }
        System.out.println(result);
    }
}
