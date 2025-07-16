import java.util.Scanner;

public class D_Manhattan_Circle {

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
            int m = sc.nextInt();

            char[][] a = new char[n][m];
            for(int i = 0; i < n; i++){
                String line = sc.next();
                for(int j = 0; j < m; j++){
                    a[i][j] = line.charAt(j);
                }
            }

            int max = 0;
            int min = 1000000;
            int ViTriCot = 0;
            int ViTriHang = 0;
            for(int i = 0; i < n; i++){
                int count = 0;
                for(int j = 0; j < m; j++){
                    if(a[i][j] == '#'){
                        count++;
                        if(count > max){
                            max = count;
                            ViTriHang = i;
                        }

                        if(count < min){
                            min = count;
                            ViTriCot = j;
                        }
                    }
                }
            }
            System.out.println((ViTriHang + 1) + " " + (ViTriCot + 1));
        }
    }
}
