#include <stdio.h>
#include <math.h>
void input(int t){
 while (t > 0) {
        long long n;
        scanf("%lld", &n);

        // Kiểm tra xem n có phải là lũy thừa của 2 không
        if ((n & (n - 1)) == 0) {
            printf("NO\n");  // n là lũy thừa của 2, không có ước số lẻ lớn hơn 1
        } else {
            printf("YES\n"); // n không phải là lũy thừa của 2, có ước số lẻ lớn hơn 1
        }

        t--;
    }
}
//(n & (n - 1)) == 0 là toán tử bitwise AND 
//Toán tử & so sánh từng bit của hai số nguyên theo quy tắc:

//Nếu cả hai bit đều là 1, kết quả là 1.

//Ngược lại, kết quả là 0.



int main(){
	int t;
	scanf("%d", &t);
	
	//input
	input(t);
	
	return 0;
}