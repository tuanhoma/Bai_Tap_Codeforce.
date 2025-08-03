import java.util.Scanner;

public class A_Erasing_Zeroes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while(t-- > 0){
            String line = sc.nextLine();
            int index_i = 0;
            int index_j = 0;
            boolean found_i = false;
            boolean found_j = false;

            for(int i = 0, j = line.length() - 1; i < line.length(); i++, j--){
                if(line.charAt(i) == '1' && !found_i){// lấy vị trí index của phần tử 1 ở đầu
                    index_i = i;
                    found_i = true;
                }

                if(line.charAt(j) == '1' && !found_j){// lấy vị trí index ptu j 1 ở cuối
                    index_j = j;
                    found_j = true;
                }
            }

            String tmp = line.substring(index_i, index_j + 1);// cắt chuỗi theo vị trí index vừa tìm được
            int count = 0;
            if(found_i && found_j){// nếu như thỏa mãn tìm dc 1 ở đầu và cuỗi thì mới vào bước này
                for(int i = 0; i < tmp.length(); i++){
                    if(tmp.charAt(i) == '0'){// đếm số lượng số 0 trong chuỗi vừa cắt dc
                        count++;
                    }
                }
                System.out.println(count);
            }else{// nêu sko tìm dc 1 ở đầu và cuối thì in ra 0 luôn
                System.out.println("0");
            }
        }
    }
}
