import java.util.Scanner;

public class A_Domino_Disaster {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            sc.nextLine();
            String line = sc.nextLine();

            StringBuilder result = new StringBuilder();
            for(int i = 0; i < n; i++){
                if(line.charAt(i) == 'U'){
                    result.append('D');
                }else if(line.charAt(i) == 'D'){
                    result.append('U');
                }else{
                    result.append(line.charAt(i));
                }
            }

            System.out.println(result.toString());
        }
    }
}
