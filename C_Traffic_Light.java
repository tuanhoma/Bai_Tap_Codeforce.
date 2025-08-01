import java.util.Scanner;

public class C_Traffic_Light {// dù đúng vẫn bị time limit

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            char a = sc.next().charAt(0);
            String line = sc.next();

            int max = 0;
            for(int i = 0; i < line.length(); i++){
                int count = 0;
                if(a == line.charAt(i)){// nếu như kí tự cần tìm thỏa mãn
                    int j = i;// gán tạm j = index
                    while(true){
                        if(j == line.length()){// tạo thành 1 vòng kí tự
                            j = 0;
                        }
                        if(line.charAt(j) == 'g'){// nếu như là kí tự g thì break;
                            if(count > max){// tìm số lượng cao nhất, hay là trương hợp xấu nhiều giây nhất
                                max = count;
                                break;
                            }
                            break;
                        }else{// tăng index và biến count
                            j++;
                            count++;
                        }
                    }
                }
            }

            System.out.println(max);// in ra biến max
        }

        sc.close();
    }
}
