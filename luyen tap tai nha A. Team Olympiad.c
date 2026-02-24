#include <stdio.h>
#include <math.h>
void input(int n, int a[]){
	for(int i = 0; i < n; i++){
		scanf("%d", &a[i]);
	}
}


void caculator(int n, int a[]){
	int sum[5000], sum1[5000], sum2[5000];
	int progarmer = 0, math = 0, pe = 0;
	
	// Phân loại trẻ em vào các mảng tương ứng
	for(int i = 0; i < n; i++){
		if(a[i] == 1)
			sum[progarmer++] += i + 1;// Lưu chỉ số (đánh số từ 1)
		else if(a[i] == 2)
			sum1[math++] += i + 1;
		else if(a[i] == 3)
			sum2[pe++] += i + 1;
	}
	
	
	// Số lượng đội tối đa là giá trị nhỏ nhất trong ba số lượng trên
    int team = progarmer;
    if (math < team) team = math;
    if (pe < team) team = pe;

    // In ra số lượng đội
	printf("%d\n", team);
	
	// In ra chỉ số của các trẻ em trong mỗi đội
	for(int i = 0 ; i < team; i++){
	printf("%d %d %d\n", sum[i], sum1[i], sum2[i]);
	}
}
int main(){
	int n;
	scanf("%d", &n);
	int a[n];
	
	//input
	input(n, a);
	
	//caculator
	caculator(n, a);
	
	return 0;
}