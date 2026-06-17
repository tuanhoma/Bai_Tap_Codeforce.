#include<stdio.h>
#include<math.h>
int main(){
	int n;
	scanf("%d", &n);
	int a[n + 1], b[n + 1];
	for(int i = 1; i <= n; i++){
		scanf("%d", &a[i]);
		b[a[i]] = i;//gán giá trị của 'i' vào địa chỉ của mảng b[]
		            //b[a[i]] la nguoi nhan qua con i la nguoi tang qua dung de luu vi tri nguoi nhan va tang 
	}               //vd: 1	2	b[2] = 1 (Người 2 nhận từ 1) đánh dấu địa chị người nhân cho mảng b[] và người tặng la i
	                // gán giá trị của a[i] và mảng b[] và đánh dấu mảng b[] theo vị trí i
	for(int i = 1; i <= n; i++){
		printf("%d ", b[i]);//sap xep theo thứ tự của người nhận
		//vd: 2, 3, 4, 1 vị trí người nhận 
        //    1, 2, 3, 4 vị trí người tặng
        //rồi in giá trị người tặng theo địa chỉ người nhận b[i] 
	}
}