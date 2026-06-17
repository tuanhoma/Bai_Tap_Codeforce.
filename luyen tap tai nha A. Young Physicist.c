#include<stdio.h>
#include<math.h>
int main(){
	int n;
	int tong = 0, tong2 = 0;
	int x1 = 0, y1 = 0, z1 = 0;
	scanf("%d", &n);
	int a[n][3];
	for( int i = 0; i < n; i++){
		for( int j = 0; j < 3; j++){
			scanf("%d", &a[i][j]);//vòng for đôi dùng để nhập từ bàn phím vào mảng 2 chiều
		}
	}
	for( int i = 0; i < 3; i++){//vì đề bài yêu cầu tính cột trước nên ta sẽ dùng thuật toán tính tổng cột trc
		for( int j = 0; j < n; j++){		
			tong += a[j][i];//tong += a[j][i] vì đề bài yêu cầu tính tính cột trước nên ta sẽ đặt [j] ở trước để tính tổng cột;		
		}
		if( i == 0 )//nếu sau khi tính tổng hết cột 1 xong thì kết quả cột 1 cộng vào biến lưu cột 1 x1 += tong
		x1 += tong;
		else if( i == 1)//nếu sau khi tính tổng hết cột 2 xong thì kết quả cột 2 cộng vào biến lưu cột 3 y1 += tong
		y1 += tong;
		else if( i == 2)//nếu sau khi tính tổng hết cột 3 xong thì kết quả cột 3 cộng vào biến lưu cột 3 z1 += tong
		z1 += tong;
		tong = 0;//đặt tổng = 0 ở cuối vì để đặt lại giá trị của tong = 0 để lạp lại tính có giá trị mới;
	}
	tong2 = x1 + y1 + z1;//dùng để tổng tất cả kết quả của các cột vào với nhau nếu tong2 các cột == 0 thì đúng còn không thì sai
	if( tong2 == 0)
	printf("YES", tong2);
	else
	printf("NO", tong2);
	return 0;
}