import java.util.Scanner;

public class B_Skibidus_and_Ohio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while(t-- > 0){
            String line = sc.nextLine();
            char[] a = line.toCharArray();
            boolean found = false;

            for(int i = 0; i < a.length - 1; i++){
                if(a[i] == a[i + 1]){// chỉ cần trong bài có 2 kí tự liên tiếp giống nhau là có thể xóa và biến đổi chuỗi về còn 1 kí tự
                    found = true;
                }
            }

            if(found){// nếu tìm thấy thì chuỗi luôn có thể biến đổi về 1
                System.out.println(1);
            }else{// còn ko có thì trả về độ dài chuỗi ban đầu
                System.out.println(line.length());
            }
        }
    }
}
