import java.util.Scanner;
public class A_QAQ {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int n = a.length();
        int count = 0;

        for(int i = 0; i < n; i++){
            if(a.charAt(i) == 'Q'){// phải có Q ở vị trí đầu thì vào điều kiện
                for(int j = i + 1; j < n; j++){
                    if(a.charAt(j) == 'A'){// phải có A ở vị trí tiếp theo sau Q
                        for(int k = j + 1; k < n; k++){
                            if(a.charAt(k) == 'Q'){// có Q ở cuối cùng sau A thỏa mãn count++;
                                count++;
                            }
                        }
                    }
                }
            }
        }

        System.out.println(count);
    }
}
