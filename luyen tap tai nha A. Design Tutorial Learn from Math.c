#include <stdio.h>
#include <math.h>
int non_prime(int a){
	if(a < 2){
		return 1;
	}
	for(int i = 2; i <= sqrt(a); i++){
		if(a % i == 0){
			return 0;
		}
	}
	return 1;
}



int main(){
	int a, x, y;
	scanf("%d", &a);
	
	 // Duyệt qua các cặp số (i, j) để tìm cặp hợp số có tổng bằng a
	for(int i = 4; i <= a / 2; i++){// Bắt đầu từ 4 vì 1, 2, 3 không phải hợp số
		int j = a - i;//để tìm hợp số của j nhanh tránh time limit, sau khi timg j thì xuống kiểm tra j có phải hợp số ko
		if(non_prime(i) == 0 && non_prime(j) == 0){ // Kiểm tra i và j là hợp số
			printf("%d %d", i, j);
			return 0;// Kết thúc chương trình sau khi tìm được cặp số
		}
	}
	
    return 0;
}