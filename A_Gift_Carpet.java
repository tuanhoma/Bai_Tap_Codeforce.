import java.util.Scanner;

public class A_Gift_Carpet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while(t-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            sc.nextLine();
            char[][] a = new char[n][m];

            for(int i = 0; i < n; i++){
                String line = sc.nextLine();
                for(int j = 0; j < m; j++){
                    a[i][j] = line.charAt(j);
                }
            }

            //biến để kiểm tra xem đã có biến kí tự cần thiết chưa chỉ lưu 1 lần
            boolean found_v = false;
            boolean found_i = false;
            boolean found_k = false;
            boolean found_a = false;

            //lưu ví trị index của từng kí tự
            int index_v = 0;
            int index_i = 0;
            int index_k = 0;
            int index_a = 0;

            for(int i = 0; i < m; i++){// duyệt theo cột
                for(int j = 0; j < n; j++){
                    if(a[j][i] == 'v' && !found_v){// phần tử cần tìm đầu tiên
                        index_v = i;
                        found_v = true;
                        break;
                    }else if(a[j][i] == 'i' && !found_i && found_v){// nếu tìm được ptu 'v' trên rồi thì mới lưu ptu này
                        index_i = i;
                        found_i = true;
                        break;
                    }else if(a[j][i] == 'k' && !found_k && found_i){// nếu tìm được ptu 'i' trên rồi thì mới lưu ptu này
                        index_k = i;
                        found_k = true;
                        break;
                    }else if(a[j][i] == 'a' && !found_a && found_k){// nếu tìm được ptu 'k' trên rồi thì mới lưu ptu này
                        index_a = i;
                        found_a = true;
                        break;
                    }
                }
            }

            if((found_v && found_i) && (found_k && found_a)){// đảm bảo đã tìm được hết ptu
                if(index_v < index_i && index_i < index_k && index_k < index_a){// đảm bảo các ptu đúng theo vị trí theo cột 'v < i < k < a'
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }else{
                System.out.println("NO");
            }
        }

        sc.close();
    }
}
