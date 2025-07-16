import java.util.Scanner;

public class A_Cover_in_Water {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        //input
        input(sc, t);
        sc.close();
    }

    public static void input(Scanner sc, int t) {
        while(t-- > 0){
            int n = sc.nextInt();
            sc.nextLine();
            String line = sc.nextLine();
            char[] a = line.toCharArray();


            int count = 0;
            int find = 0;
            boolean found = true;
            for(int i = 0; i < n; i++){
                if(a[i] == '.') {
                    count++;
                    find++;
                }else{
                    count = 0;
                }
                if(count >= 3){
                    found = false;
                }
            }
            if (!found){
                System.out.println("2");
            }else{
                System.out.println(find);
            }
        }
    }
}
