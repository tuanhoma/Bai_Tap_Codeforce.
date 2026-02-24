#include<stdio.h>
#include<math.h>
int main(){
	int a, b, c;//a là dài, b là rộng, c là cao
	int s1, s2, s3;
	int tong = 0, sxq = 0;
	scanf("%d %d %d", &s1, &s2, &s3);//nhập vào diện tích mặt của hình hộp chữ nhật
	tong = sqrt(s1 * s2 * s3);//căn bậc 2 của 3diện tích 3 mặt nhân với nhau dùng để tìm cạnh hình hộp chữ nhật
	a = tong / s1;//tìm cạnh hình hộp chữ nhật
	b = tong / s2;
	c = tong / s3;
	sxq = 4 * ( a + b + c);//diện tích xung quanh hình chữ nhật là 4 nhân cách cạnh hình hộp chữ nhật
	printf("%d", sxq);
	return 0;
	
	
}