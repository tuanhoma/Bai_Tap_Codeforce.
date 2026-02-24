#include<stdio.h>
#include<math.h>
int main(){
	int  x;
	int  p;
	int count = 0;
	int tong = 0;
	scanf("%d", &x);
	p = x;//dùng để lưu tạm 'p' = 'x' để khi xuống vòng lặp 'x' bị giảm giá trị còn 'p' vẫn giữ nguyên giá trị của 'x';
	if( x >= 1 && x <= 1000000)
	for(int i = 5; i > 0; i--){
		int temp = x - i;//dùng để nhớ tạm giá trị của 'x' - 'i' sau khi 'x' đã bị trừ; 
		if(temp >= 0){//dùng để duyệt giá trị nếu giá trị 'temp' dương thì tiếp tục tính toán nếu âm thì không;
		count += 1;//dùng để đếm số lần giá trị của 'x' trừ đi 'i' để gia trị 'x' trừ hết và = 0'
		tong += i;//dùng để lưu giá trị 'i' mà 'x' đã trừ;
		i++;//dùng để khi trở lại vòng lặp 'i' vẫn giữ nguyên giá trị vd: 'i' = 5 xuống thuật toán thì i++ -> 'i' = 6 sau đó 'i' trở lại vòng lặp 'i'-- -> 'i' = 5 vẫn giữ nguyên giá trị ban đầu trong điều kiện 'IF' nếu không trong điều kiện thì giá trik 'i' sẽ bị giảm; 
		x = temp;//dùng để lưu giá trị của 'x' sau khi đã tính toán;
		if(tong == p)//điều kiện nếu tong == p thì sẽ kết thúc vòng lặp, p là giá trị đã được gán ban đầu không bị can thiệp;
		goto end;
		}
		else
	    continue;//nếu điều kiện 'IF' trên ko có thì trở lại vòng lặp 'for'
	}
	end:
	printf("%d", count);
	return 0;
}




