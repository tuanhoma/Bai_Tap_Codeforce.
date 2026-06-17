#include <stdio.h>
#include <math.h>
#include <stdlib.h>
const int max = 20;

void input(int a[max][max], int n, int m){
	for(int i = 0; i < n; i++){
		for(int j = 0; j < m; j++){
			printf("Element [%d][%d] = ", i, j);
			scanf("%d", &a[i][j]);
		}
	}
}




void tich(int c[max][max],int a[max][max], int b[max][max], int n,int m, int l){
	for(int i= 0; i < n; i++){
		for(int j = 0; j < m; j++){
			c[i][j] = 0;
			for(int k = 0; k < l; k++){
				c[i][j] = c[i][j] + a[i][k] * b[k][j]; 
			}
		}
	}
}



void output(int a[max][max], int n, int m){
	for(int i = 0; i < n ;i++){
		for(int j = 0; j < m; j++){
			printf("%5d", a[i][j]);
		}
		printf("\n");
	}
}



int main(){
    system("cls");
	int a[max][max], b[max][max], c[max][max], m, l, n;
	printf("Nhap n = "), scanf("%d", &m);
	printf("Nhap m = "), scanf("%d", &l);
	printf("Nhap l = "), scanf("%d", &n);// dù hàm ở trên chỉ khai báo mảng a hai chiều nhưng ở dưới chúng ta có thể chuyền tham số mảng 2 chiều b cho hàm void trên
	printf("Enter maxtrix a : \n"), input(a, m, l);
	printf("Enter maxtrix b : \n"), input(b, l, n);
	printf("printf maxtrix a : \n"), output(a, m, l);
	printf("printf maxtrix b : \n"), output(b, l, n);
	
	tich(c, a, b, n, m);
	printf("Printf matrix c = a + b:\n"), 	output(c, n, m);
	system("pause");
	return 0;
	
}