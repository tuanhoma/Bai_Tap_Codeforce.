#include <stdlib.h>
int compare(const void *a, const void *b) {// hàm dùng để xắp xếp các số từ bé đến lớn trong mảng
    return (*(int *)a - *(int *)b);
}

int main(){
	qsort(result, index, sizeof(int), compare);
}