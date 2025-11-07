
import java.util.Scanner;

public class A_Cards {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String line = sc.nextLine();
        int count_n = 0;
        int count_z = 0;
        for(int i = 0; i < n; i++){
            if(line.charAt(i) == 'n'){
                count_n++;
            }else if(line.charAt(i) == 'z'){
                count_z++;
            }
        }

        while(count_n != 0){
            System.out.print("1" + " ");
            count_n--;
        }

        while(count_z != 0){
            System.out.print("0" + " ");
            count_z--;
        }

        System.out.println();
    }
}
