#include <stdio.h>
#include <math.h>
int move(int a, int b){
	int tamp = a % b;
	if(tamp == 0){
		return 0;// Nếu phần dư bằng 0, trả về 0 (không cần di chuyển). in ra 0 luon
	} else{
		return b - tamp;// Ngược lại, trả về b - tap (số lần di chuyển cần thiết). in ra số lần di chuyển cần thiết nếu như là số lẻ thì sẽ dc làm tròn và in ra số đã dc làm tròn ở dưới
	}
}





int main(){
	int t, count = 0;
	int a, b;
	scanf("%d", &t);
	while(t--){
		scanf("%d %d", &a, &b);
		printf("%d\n", move(a, b));
	}
	return 0;
}