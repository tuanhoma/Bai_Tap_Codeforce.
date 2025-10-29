import java.util.Scanner;

public class B_Square_or_Not {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            sc.nextLine();
            String line = sc.nextLine();

            int tmp = (int)Math.sqrt(n);

            if(tmp * tmp != n || n < 4){
                System.out.println("NO");
            }else{
                //  Thêm kiểm tra phần "giữa" có chứa '1' hay không, nếu ở giứa trong đoạn các số 0 có 1 ở giữa thì in no vì đoạn 0 ở giữa ko dc có số 1;
                boolean innerHasOne = false;
                for(int i = 0; i < tmp; i++){
                    for(int j = 0; j < tmp; j++){
                        int index = i * tmp + j;
                        // Bỏ qua biên
                        if(i > 0 && i < tmp - 1 && j > 0 && j < tmp - 1){
                            if(line.charAt(index) == '1'){
                                innerHasOne = true;
                                break;
                            }
                        }
                    }
                    if(innerHasOne) break;
                }

                // Nếu phần giữa có '1' → NO ngay
                if(innerHasOne){
                    System.out.println("NO");
                    continue;
                }

                boolean found_1 = false;// kiểm tra xem có tồn tại 1 hay ko
                boolean found_0 = false;// kiểm tra xem có tồn tại 0 ko
                int count_r = 0;
                int count_l = 0;
                for(int i = 0, j = n - 1; i < n; i++, j--){
                    if(i > j){
                        break;
                    }

                    if(line.charAt(i) == '1'){
                        found_1 = true;
                    }
                    if(line.charAt(i) == '0'){
                        found_0 = true;
                    }

                    if(line.charAt(i) == '1' && !found_0){// đếm số lượng số 1 bên tráI
                        count_l++;
                    }

                    if(line.charAt(j) == '1' && !found_0){// ĐẾM SỐ LƯỢNG SỐ 1 BÊN PHẢI
                        count_r++;
                    }

                }


                if((found_1 && found_0) || n == 4){// NẾU CHUỖI XUẤT HIỆN CẢ 0 VÀ 1 HOẶC N == 4
                    if(count_r == count_l){// nếu số lượng só 1 bên trái và phải bằng nhau thì đúng
                        System.out.println("YES");
                    }else{// nếu ko == nhau thì in no
                        System.out.println("NO");
                    }
                }else{
                    System.out.println("NO");
                }
            }
        }
    }
}
