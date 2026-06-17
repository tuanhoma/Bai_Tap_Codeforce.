#include <stdio.h>
#include <math.h>
int calculator(int n, int m, int a, int b){
	// ve 1 luot
	int  count = 0;
	count = n * a;
	
	// ve m luot
	int  count1 = 0;
	count1 = (n / m) * b + (n % m != 0) * b;
	//n % m != 0: Kiểm tra xem có lượt còn lại không (nếu có, giá trị là 1; nếu không, giá trị là 0).
	//Nhân với b: Nếu có lượt còn lại, phải mua thêm một vé m lượt nữa (vì chỉ được phép mua vé m lượt).
	
	
    //ca ve 1 luot va m luot
	int  count2 = 0;
	count2 = (n / m) * b + (n % m) * a;
	// (n % m) * a;
	// (n % m) là số lượt sau khi mua cho các vé đi m lượt nếu dư thì sẽ phải mua vé lẻ nhân với a


	if(count <= count1 && count <= count2)
	return count;
	else if(count1 <= count && count1 <= count2)
	return count1;
	else if(count2 <= count && count2 <= count1)
	return count2;
}




int main(){
	int n, m, a, b;
	scanf("%d %d %d %d", &n, &m, &a, &b);

    //input
	int result = calculator(n, m, a, b);
	printf("%d", result);
	return 0;
}