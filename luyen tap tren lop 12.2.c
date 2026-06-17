#include<stdio.h>
#include<math.h>
#include<ctype.h>
#include<string.h>
#include<stdlib.h>
void input(int *a, int *pn){
	int n;
	printf("nhap n = "); scanf("%d", &n);
	*pn = n;
	for( int i = 0; i < n; i++){
		printf("Element[%d] = ", i), scanf("%d", a + i);
	}
}

void output(const int *a, int n){
	for(int i = 0; i < n; i++){
		printf("%d ", *(a + i));
	}
	printf("\n");
}

int isquare(int n){
	if(n < 0) return 0;
	else{
		int m = sqrt(n);
		return (m*n == n);
	}
}




int countsquare(int a[], int n){
	int i, d = 0;
	for(i = 0; i < n; i++)
	if(isquare(a[i])) d++;
	return d;
	
}


int countevers(int a[], int n){
	int i, d = 0;
	for(i =0; i < n; i++)
	   if(a[i] % 2 == 0) d++;
	   return d;
	
	
}
int sumarray(int a[], int n){
	int i, s = 0;
	for(i = 0; i < n; i++)
	s += a[i];
	return s;
	
}





int main(){
	system("cls");
	//INPUT - @STUDENT: ADD YOUR CODE FOR INPUT HERE

	int a[100], n;
	printf("Array a:\n"), input(a, &n);

	//fixed DO NOT EDIT ANY THINGS HERE
	printf("\nOUTPUT:\n");
	//@STUDENT: WRITE YOUR OUTPUT HERE
	printf("\nprintf array 1: "); output(a, n);
	 printf("\nprintf array suare: %d", countsquare(a, n));
		printf("\nprintf array evers: %d", countevers(a, n));
			printf("\nprintf array sumarray: %d", sumarray(a, n));
	
	
	
	
	
	//--FIXED part DO NOT EDIT ANY THINGS HERE
	printf("\n");
	system("pause");
	return 0;
}