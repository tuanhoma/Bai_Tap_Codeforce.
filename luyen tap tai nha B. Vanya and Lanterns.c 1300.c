#include <stdio.h>
#include <math.h>
void input(int n, int a[n]){
	for(int i = 0; i < n; i++){
		scanf("%d", &a[i]);
	}
}


void list(int n, int a[n]){
	for(int i = 0; i < n - 1 ; i++){
		for(int j = 0; j < n - i - 1 ; j++){
			if(a[j] > a[j + 1]){// bởi vì a[j + 1] khi chạy cuối vòng lặp nó sẽ truy cập vào phần tử ở ngoài nên ta có điều kiện ' n- i - 1' để dừng trc 1 giá trị để tránh truy cập ngoài mảng và vẫn có thể so sánh đầy đủ do có a[j] so sánh với a[j + 1]
				int tamp = a[j];
				a[j] = a[j + 1];
				a[j + 1] = tamp;
			}
		}
	}
}




int max_area(int n, int a[n]){
	int max = 0;
	for(int i = 0; i < n - 1; i++){
		int tong = 0;
		tong = a[i + 1] - a[i];
		if(max < tong)
		max = tong;
	}
	return max;
}




int min_area(int n, int a[n]){
		int sum = 0;
		sum = a[0] - 0;
	    return sum;
}



int min_last(int n, int a[n], int l){
	    int minus = 0;
	    int max = 0;
	    for(int i = 0; i < n; i++){
	    	if(max < a[i])
	    	max = a[i];
		}
		minus = l - max;
		return minus;
}



int max_last(int n, int a[n], int l){
	    int max = 0;
	    for(int i = 0; i < n; i++){
	    	if(max < a[i])
	    	max = a[i];
		}
		return max;
}



int main(){
	//n is latern, l is the leght street
	int n, l;
	scanf("%d %d", &n, &l);
	int a[n];
	
	//input
	input(n, a);
	
	//list
	list(n, a);
	
	//max and sum 
	int compare_max = max_area(n, a);
	int compare_min = min_area(n, a);
	int compare_minus = min_last(n, a, l);
	int compare_max_last = max_last(n, a, l);
	
	
if(compare_max_last != l){
	//===============================================	
	//DONT HAVE 'MAX' IN ARRAY
	//max
	double tamp1 = (double)compare_max / 2;
	if(tamp1 > compare_minus){
	double result_max = (double)max_area(n, a);
	printf("%.10lf", result_max / 2);
    }
    
	//min
	if(compare_minus > tamp1){
	double result_min = (double)min_last(n, a, l);
	printf("%.10lf", result_min);
    }
}	
	
	
	
	
else if(a[0] == 0){
//===============================================
    //HAVE '0' AND 'MAX' IN ARRAY
    //max
	double result_max = (double)max_area(n, a);
	printf("%.10lf", result_max / 2);
    
}
	
	
	
	
else if(a[0] != 0){
//===============================================	
	//DONT HAVE '0' IN ARRAY
	//max
	double tamp = (double)compare_max / 2;
	if(tamp > compare_min){
	double result_max = (double)max_area(n, a);
	printf("%.10lf", result_max / 2);
    }
    
	//min
	if(compare_min > tamp){
	double result_min = (double)min_area(n, a);
	printf("%.10lf", result_min);
    }
}




else if(compare_max_last != l && a[0] != 0){
//===============================================
    //DONT HAVE '0' AND 'MAX' IN ARRAY
    double tamp = (double)compare_max / 2;
	if(tamp > compare_min && tamp > compare_minus){
	double result_max = (double)max_area(n, a);
	printf("%.10lf", result_max / 2);
    }
    
	//min
	else if(compare_min > tamp && compare_min > compare_minus){
	double result_min = (double)min_area(n, a);
	printf("%.10lf", result_min);
    }
    
    else if(compare_minus > tamp && compare_minus > compare_min){
	double result_min = (double)min_last(n, a, l);
	printf("%.10lf", result_min);
    }
}
	
	return 0;
}
