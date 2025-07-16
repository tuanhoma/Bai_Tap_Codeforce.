import java.util.Scanner;

public class A_Fibonacciness {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        //input
        input(sc, t);
        sc.close();
    }

    public static void input(Scanner sc, int t) {
        while(t-- > 0){
            int a_1 = sc.nextInt();
            int a_2 = sc.nextInt();
            int a_4 = sc.nextInt();
            int a_5 = sc.nextInt();

            int a_3 = 0;
            int count_Test1 = 0;
            a_3 = a_1 + a_2;
            if(a_3 == a_1 + a_2){
                count_Test1++;
            }
            if(a_4 == a_2 + a_3){
                count_Test1++;
            }
            if(a_5 == a_3 + a_4){
                count_Test1++;
            }



            a_3 = 0;
            int count_Test2 = 0;
            a_3 = a_4 - a_2;
            if(a_3 == a_1 + a_2){
                count_Test2++;
            }
            if(a_4 == a_2 + a_3){
                count_Test2++;
            }
            if(a_5 == a_3 + a_4){
                count_Test2++;
            }



            a_3 = 0;
            int count_Test3 = 0;
            a_3 = a_5 - a_4;
            if(a_3 == a_1 + a_2){
                count_Test3++;
            }
            if(a_4 == a_2 + a_3){
                count_Test3++;
            }
            if(a_5 == a_3 + a_4){
                count_Test3++;
            }


            int result = ((count_Test1 > count_Test2 ? count_Test1 : count_Test2) > count_Test3 ? (count_Test1 > count_Test2 ? count_Test1 : count_Test2) : count_Test3);
            System.out.println(result);
        }
    }
}
