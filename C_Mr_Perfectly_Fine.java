import java.util.Scanner;

public class C_Mr_Perfectly_Fine {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            boolean found_10 = false;
            int tmp_10 = Integer.MAX_VALUE;

            boolean found_01 = false;
            int tmp_01 = Integer.MAX_VALUE;

            boolean found_11 = false;
            int tmp_11 = Integer.MAX_VALUE;

            for(int i = 0; i < n; i++){
                int a = sc.nextInt();
                String b = sc.next();

                if(b.equals("10")){// lấy số a bé nhất nếu chuỗi là "10"
                    if(a < tmp_10){
                        tmp_10 = a;
                        found_10 = true;
                    }
                }else if(b.equals("01")){
                    if(a < tmp_01){// lấy số a bé nhất nếu chuỗi là '01'
                        tmp_01 = a;
                        found_01 = true;
                    }
                }else if(b.equals("11")){
                    if(a < tmp_11){// lấy số a bé nhất nếu chuỗi là '11'
                        tmp_11 = a;
                        found_11 = true;
                    }
                }
            }

            if(found_10 && found_01 && found_11){// nếu tìm thấy cả 3
                int result = tmp_01 + tmp_10;
                System.out.println(Math.min(result, tmp_11));// nếu cái nào bé hơn
            }else if(found_10 && found_01){// tìm thấy 2 thằng thì in tổng bé nhất của cả 2 thằng ra
                int result = tmp_01 + tmp_10;
                System.out.println(result);
            }else if(found_11) {// nếu chỉ tìm thấy thằng 11 thì in cái bé nhất của nó ra
                System.out.println(tmp_11);
            }else{
                System.out.println("-1");// nếu ko tìm thấy gì thỏa mãn in ra -1
            }
        }
    }
}
