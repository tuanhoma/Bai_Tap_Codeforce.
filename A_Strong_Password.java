import java.util.Scanner;

public class A_Strong_Password {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while(t-- > 0){
            String line = sc.nextLine();
            StringBuilder result = new StringBuilder();
            result.append(line.charAt(0));

            boolean found = false;
            for(int i = 1; i < line.length(); i++){
                if(line.charAt(i) == line.charAt(i - 1) && !found){// chèn 1 kí tự nếu như có 2 kí tự đúng liên tiếp nhau rồi ko chèn nữa
                    if(line.charAt(i) == 'a'){// nếu kí tự liên tiếp là a thì chèn kí tự khác
                        result.append('b');
                    }

                    result.append('a');// nếu là các kí tự liên tiếp khác thì mặc định chèn a
                    found = true;
                }

                result.append(line.charAt(i));
            }

            if(!found){// nếu như ko có kí tự nào liên tiếp nhau thì chèn ở đầu và nếu kí tự đầu là a thì để tranhs trùng phải chèn kí tự khác
                if(line.charAt(0) == 'a'){
                    result.append('b');
                }else{
                    result.append('a');
                }
            }
            System.out.println(result);
        }
    }
}
