import java.util.Scanner;

public class A_Verify_Password {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();

            boolean found = false;
            for(int i = 0; i < n - 1; i++){
                if(Character.isLetter(s.charAt(i)) && Character.isDigit(s.charAt(i + 1))){
                    found = true;
                    break;
                }

                if(Character.isDigit(s.charAt(i)) && Character.isDigit(s.charAt(i + 1))){
                    int a = s.charAt(i) - '0';
                    int b = s.charAt(i + 1) - '0';
                    if(a > b){
                        found = true;
                        break;
                    }
                }

                if(Character.isLetter(s.charAt(i)) && Character.isLetter(s.charAt(i + 1))){
                    char a = s.charAt(i);
                    char b = s.charAt(i + 1);
                    if(a > b){
                        found = true;
                        break;
                    }
                }
            }

            if(!found){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
