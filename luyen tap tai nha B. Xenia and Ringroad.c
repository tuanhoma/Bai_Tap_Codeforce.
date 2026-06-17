#include <stdio.h>
#include <math.h>
void input(int m, int a[]){
	for(int i = 0; i < m; i++){
		scanf("%d", &a[i]);
	}
}


int findMin(int m, int a[]) {
    int minVal = a[0]; // Giả sử phần tử đầu tiên là nhỏ nhất
    for (int i = 1; i < m; i++) {
        if (a[i] < minVal) {
            minVal = a[i];
        }
    }
    return minVal;
}

// Hàm tính toán
long long calculator(int n, int m, int a[]) {
    int minVal = findMin(m, a); // Tìm giá trị nhỏ nhất trong mảng
    long long count = 0; // Biến đếm
    int currentHouse = 1; // Vị trí ban đầu của Xenia

    for (int i = 0; i < m; i++) {
        int targetHouse = a[i]; // Ngôi nhà mục tiêu của nhiệm vụ hiện tại

        // Tính thời gian di chuyển từ currentHouse đến targetHouse
        if (targetHouse >= currentHouse) {
            count += (targetHouse - currentHouse);
        } else {
            count += (n - currentHouse + targetHouse);
        }

        currentHouse = targetHouse; // Cập nhật vị trí hiện tại
    }

    return count; // Trả về tổng thời gian
}




int main(){
	int n, m;
	scanf("%d %d", &n, &m);
	int a[m];
	
	//input
	input(m, a);
	
	//min
	findMin(m, a);
	
	//caculator
	long long result = calculator(n, m, a);
	printf("%lld", result);
	return 0;
}