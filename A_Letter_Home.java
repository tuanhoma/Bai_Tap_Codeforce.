import java.util.Scanner;

public class A_Letter_Home {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int s = sc.nextInt();
            int[] a = new int[n];

            int max = 0;
            int min = 10000000;
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
                if(a[i] > max){
                    max = a[i];
                }

                if(a[i] < min){
                    min = a[i];
                }
            }

            int result1 = Math.abs(s - min) + Math.abs(max - min);
            // |s - min| là đoạn và ở vị trí đứng hiện tại sẽ chọn đi đầu tiên sang bên trái, mỗi lần đi sẽ mất nhiều thời gian để duyệt một bên sẽ mất thời gian là 2 lần vì bị đi lặp và rồi duyệt bên còn lại chỉ cần đi 1 lần
            // |max - min| sẽ là bước để đi phần còn lại và nó sẽ có luôn thời gian đi lặp khi duyệt lần đầu luôn nên ở bước duyệt đầu tiên |s - Min| sẽ chỉ tính thời gian đi đơn thuần,
            // biến réult sẽ là kết quả của tổng số lần phải đi tối ưu nhất

            int result2 = Math.abs(s - max) + Math.abs(max - min);
            // |s - max| là đoạn và ở vị trí đứng hiện tại sẽ chọn đi đầu tiên sang bên phải, mỗi lần đi sẽ mất nhiều thời gian để duyệt một bên sẽ mất thời gian là 2 lần vì bị đi lặp và rồi duyệt bên còn lại chỉ cần đi 1 lần
            System.out.println(result1 < result2 ? result1 : result2);// in ra kết quả tối ưu nhất khi duyệt bên trái hay phải trước sẽ tốn ít thời gian nhất, vì duyệt 1 bên lần đầu sẽ tốn x2 thời gian nên cần chọn bên ngắn và ít nhất để tối ưu thời gian
        }
    }
}
