import com.sun.jdi.Value;

import java.util.*;

public class A_Extremely_Round {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        List<Integer> round = new ArrayList<>();
        for(int i = 1; i <= 9; i++){
            int num = i;
            while(num <= 999999){// add tất cả các số Extreme round <= 999999 vào danh sách
                round.add(num);
                num *= 10;
            }
        }

        Collections.sort(round);// sắp xếp các ptu trong danh sách từ bé đến lớn
        while(t-- > 0){
            int n = sc.nextInt();
            int count = 0;
            for(int x : round){// gán từng phần tử trong danh sách vào x
                if(x <= n){// nếu như các ptu trong danh sách được gán vào x <= n thì biến count cộng
                    count++;//  bởi vì đề bài yêu cầu tìm các số Extrme round <= n nên ở bước trên ta đã tìm tất cả các số đố add vào danh sách, nên giờ chỉ cần gán các ptu đó vào x và xem nếu nó <= n thì thỏa mãn các số EXtreme ở trong n
                }else{
                    break;
                }
            }

            System.out.println(count);
        }
        sc.close();
    }
}
