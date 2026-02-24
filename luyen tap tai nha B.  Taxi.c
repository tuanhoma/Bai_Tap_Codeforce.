#include<stdio.h>
#include<math.h>
int main(){
	int tong = 0;
    int temp, temp1, temp2;
    int count, count1, count2, count3;
	int group;
	scanf("%d", &group);
	int a[group];
	for(int i = 0; i < group; i++){
		scanf("%d", &a[i]);	
	    if(a[i] == 4)
	    count++;
	    else if(a[i] == 3 || a[i] == 1){
	    	temp += a[i];
	    	if(temp > 4)
	    	temp -= a[i];
	    	else if(temp == 4){
	    		count1++;
				temp = 0;
			}
		}
		else if(a[i] == 2 || a[i] == 1){
			temp1 += a[i];
			if(temp1 > 4)
			temp -= a[i];
			else if(temp1 == 4){
			    count2++;
			    temp1 = 0;
			}
			
		}
		else if(a[i] == 1){
				temp2 += a[i];
		if(temp2 > 4)
		temp -= a[i];
		else if(temp2 == 4){
			    count3++;
			    temp2 = 0;
		    }
	    }	
	}
	tong = count + count1 + count2 + count3;
	printf("%d", tong / 4);
	return 0;
}




