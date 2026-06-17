#include <stdio.h>
#include <math.h>
void input(int t){
	while(t > 0){
		int n;
		scanf("%d", &n);
		int a[n];
		for(int i = 0; i < n; i++){
			scanf("%d", &a[i]);
		}
		
        // Xác định giá trị phổ biến (giá trị xuất hiện nhiều nhất)
        int common_value;
        if (a[0] == a[1]) {
            common_value = a[0]; // Nếu a[0] == a[1], thì a[0] là giá trị phổ biến
        } else {
            // Nếu a[0] != a[1], kiểm tra a[2] để xác định giá trị phổ biến
            if (a[0] == a[2]) {
                common_value = a[0];
            } else {
                common_value = a[1];
            }
        }

        // Tìm vị trí của phần tử duy nhất
        for (int i = 0; i < n; i++) {
            if (a[i] != common_value) {
                printf("%d\n", i + 1); // In ra vị trí (đếm từ 1)
                break;
            }
        }
		t--;
	}
}


int main(){
	int t;
	scanf("%d", &t);
	
	//input
	input(t);
	return 0;
}