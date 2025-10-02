import java.util.Scanner;

public class A_Make_Even {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int count = 0;
            if(n % 2 == 0){// nếu như chia dc 2 ngay từ đầu thì in ra 0 luôn thỏa mãn
                System.out.println("0");
            }else{
                String line = String.valueOf(n);
                boolean found = false;
                for(int i = 0; i < line.length(); i++){
                    int tmp = Character.getNumericValue(line.charAt(i));
                    if(tmp % 2 == 0){
                        found = true;
                    }
                }

                if(!found){// nếu như ko có số chẵn trong dãy số thì luôn ko thỏa mãn
                    System.out.println("-1");
                }else{
                    if(Character.getNumericValue(line.charAt(0)) % 2 == 0){// nếu như ở đầu là số chẵn thì cần 1 bước là dc
                        System.out.println("1");
                    }else{// còn lại có số chãn ko phải ở đầu thì luôn cần 2 bước
                        System.out.println("2");
                    }
                }
            }
        }
    }
}
