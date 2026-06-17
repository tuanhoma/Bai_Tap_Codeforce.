#include <stdio.h>
#include <math.h>
#include <string.h>
#include <ctype.h>
#include <stdlib.h>
int main(){
	int n, count = 0;
	scanf("%d", &n);
	char a[100];
	getchar();
	while(n > 0){
		scanf("%s", a);
		if(strcmp(a, "Tetrahedron") == 0){//So sánh chuỗi a với chuỗi. Nếu giống nhau, hàm strcmp trả về 0 và thực hiện điều kiện của if
		                                  //nếu sai thì trả về 1 và thực sét điều kiện khác
			count += 4;                   // chuỗi lí tự thì dùng dấu "  "   còn  1 kí tự thì dấu '  '
		}
		else if(strcmp(a, "Cube") == 0){
				count += 6;
		}
		else if(strcmp(a, "Octahedron") == 0){
				count += 8;
		}
		else if(strcmp(a, "Dodecahedron") == 0){
			count += 12;
		}
		else if(strcmp(a, "Icosahedron") == 0){
			count += 20;
		}
		n--;
	}
	printf("%d", count);
	return 0;
}