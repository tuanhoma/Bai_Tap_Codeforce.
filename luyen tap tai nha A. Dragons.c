#include <stdio.h>
#include <math.h>
void input(int n, int a[][2]){
	for(int i = 0; i < n; i++){
		for(int j = 0; j < 2; j++){
			scanf("%d", &a[i][j]);
		}
	}
}



void sort(int n, int a[][2]) {
    for (int i = 0; i < n - 1; i++) {// phải dùng 2 vòng lặp lồng nhâu để sắp xếp
        for (int j = 0; j < n - i - 1; j++) {//(n - i - 1) dùng để trừ đi các trường hơp đã sắp xếp tránh lãng phí tài 
            if (a[j][0] > a[j + 1][0]) { // Sắp xếp tăng dần
                // Hoán đổi hàng j và hàng j + 1
                int temp1 = a[j][0];// nhớ tạm giá trị của hàng đầu cột 0
                int temp2 = a[j][1];// nhớ tạm giá trị của hàng đầu cột 1
                a[j][0] = a[j + 1][0];// dùng để dổi vị trí hàng a[i][0] với hàng a[j + 1][0]
                a[j][1] = a[j + 1][1];// dùng đổi vị trí hàng a[i][1] với hàng  hàng a[j + 1][1]
                a[j + 1][0] = temp1;
                a[j + 1][1] = temp2;
            }
        }
    }
}



int tinh(int s, int n, int a[][2]){
	for(int i = 0, j = 0; i < n; i++){
		if(s > a[i][j])
		s += a[i][j + 1];
		else if(s <= a[i][j]){
			return 0;
			break;
		}
	}
	return 1;
}
	

int main(){
	int s , n;
	 // Nhập giá trị s va n
	scanf("%d %d", &s, &n);
	int a[n][2];
	//Nhập mảng a
	input(n, a);
	
	//hàm xắp xếp từ bé đến lớn
	sort(n, a);
	
	// Gọi hàm tinh và kiểm tra kết quả
	tinh(s, n, a);
	int result = tinh(s, n, a);
	if(result == 0)
	printf("NO");
	else
	printf("YES");
	return 0;
}