#include <stdio.h>
#include <math.h>
#include <string.h>
#include <ctype.h>
#include <stdlib.h>
int main(){
	char a[201];
	scanf("%s", a);
	int len = strlen(a);
	int i = 0;
	while(len > i){// sét điều kiện nếu như i sau khi cộng ở dưới vầ lặp lại sét điều kiện len < i thì hủy vòng lặp dùng while để thực hiện 2 trg hợp hoặc đến khi đúng
		if(a[i] == 'W' && a[i + 1] == 'U' && a[i + 2] == 'B'){ 
			printf(" ");
			i += 3;// nếu như điều kiện trên đúng thì i cập nhật thêm 3 để đổi đến vị trí thứ 3 và đi lại vòng lặp mới để sét điều kiện tiếp
		}
		else{
			printf("%c", a[i]);
			i++; // nếu như điều kiện if sai thì thực hiện in ra i và tăng thêm 1 lặp lại vòng lặp mới để sét tiếp điều kiện
		}
	}
	return 0;
}