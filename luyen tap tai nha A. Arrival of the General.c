#include<stdio.h>
#include<math.h>
int main(){
	int max = 0, min = 100000;
	int n;
	scanf("%d", &n);
	int a[n];
	for(int i = 0; i < n; i++){
		scanf("%d", &a[i]);
	}
	
	int max_1 = 0;
	int min_1 = 0;
	
	//Dùng để tìm max( số lớn nhất và đánh dấu vị trí trong mảng )
	for(int i = 0; i < n; i++){
		if(max < a[i]){
			max = a[i];
			max_1 = i;
		}
	}

				
	//Dùng để đổi chỗ max về đứng đầu tiên mảng , mỗi lần chỉ dc đổi với số liền kề và được đếm số lần đổi để đứng đầu mảng	
	//max_1 = i ở trên		
    int count = 0;
    while(max_1 > 0){
    	int tam = a[max_1];
    	a[max_1] = a[max_1 - 1];
    	a[max_1 - 1] = tam;
    	max_1--;
    	count++;
	}
	
	
    //Tìm min và vị trí của min trong mảng sau khi đã đổi chỗ max lên đầu mảng;
	for(int i = 0; i < n; i++){
		if(min >= a[i]){
			min = a[i];
			min_1 = i;
		}
	}
	
	//Dùng để đổi chỗ min về cuối mảng và mỗi lần dooir chỉ dc đổi với số liền kề, mỗi lần đỗi sẽ được đếm sôs lần đổi
	//min_1 = i ở trên
	while(	min_1 < n - 1){
		int tam = a[min_1];
		a[min_1] = a[min_1 + 1];
		a[min_1 + 1] = tam;
		min_1++;
		count++;
	}
	
	
	printf("%d", count);
	
	return 0;
	
}
