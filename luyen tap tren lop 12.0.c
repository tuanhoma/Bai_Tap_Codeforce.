#include<stdio.h>
#include<math.h>
#include<ctype.h>
#include<string.h>
#include<stdlib.h>
void input(int a[], int *pn){
	int n;
	printf("nhap n = "); scanf("%d", &n);
	*pn = n;
	for( int i = 0; i < n; i++){
		printf("Element[%d] = ", i), scanf("%d", &a[i]);
	}
}

void output(int a[], int n){
	for(int i = 0; i < n; i++){
		printf("%d ", a[i]);
	}
	printf("\n");
}






int main(){
	system("cls");
	//INPUT - @STUDENT: ADD YOUR CODE FOR INPUT HERE

	int a[100], b[100], n, m;
	printf("Array a:\n"), input(a, &n);
	printf("Array b:\n"), input(b, &m);
	//fixed DO NOT EDIT ANY THINGS HERE
	printf("\nOUTPUT:\n");
	//@STUDENT: WRITE YOUR OUTPUT HERE
	printf("printf array a: "); output(a, n);
	printf("printf array b: "); output(b, m);
	
	
	
	
	//--FIXED part DO NOT EDIT ANY THINGS HERE
	printf("\n");
	system("pause");
	return 0;
}