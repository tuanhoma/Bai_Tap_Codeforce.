#include<stdio.h>
#include<math.h>
int main(){
	int  a, b, c;
	int i = 1;
	int sum = 0;
	int sum1 = 0;
	int tong;
	int sum2 = 0;
	int pass = 0, pass1 = 0, pass2 = 0, fail = 0, fail1 = 0, fail2 = 0;
	int passed, failed;
	float trungbinh ;
    printf("nhap so hoc sinh trong lop: "), scanf("%d", &a);
	if( a >= 1) //so hoc sinh trong lop
	{
		baitoan:
		for( i ; i <= a; i++ )
		{
			printf("diem so cua hoc sinh %d la: ", i), scanf("%d", &c);
			if( c < 0 || c > 10) //diem so cua hoc sinh
			goto check1;
			sum += c;
			if( c >= 5)
			pass++;
			else if( c < 5)
			fail++;
		}	
		goto tinhdiem;
		check1:	
			do
			{
				printf("nhap diem so sai vui long nhap lai");
				printf("\ndiem so cua hoc sinh %d la: ", i), scanf("%d", &c);
			}while( c < 0 || c > 10); //diem so cua hoc sinh
			sum2 += c;
			if( c >= 5)
			pass1++;
			else if( c < 5)
			fail1++;
       
		for( i++ ; i <= a; i++)
		{
			printf("diem so cua hoc sinh %d la: ", i), scanf("%d", &c);
			if( c < 0 || c >10) //diem so cua hoc sinh
			goto check1;
			sum1 += c;
			if( c >= 5)
			pass2++;
			else if( c < 5)
			fail2++;
		}
		tinhdiem:
			tong = sum + sum1 + sum2;
			    printf("%d", tong);
			trungbinh = tong*1.00/a;
			    printf("\n%.2f", trungbinh);
			passed = pass + pass1 + pass2;
			    printf("\n%d", passed);
			failed = fail + fail1 + fail2;
			    printf("\n%d", failed);
	            
		
		
	}
	else if( a < 1) //so hoc sinh trong lop
	
	{
		    do
		{
			printf("sai vui long nhap lai");
			printf("\nnhap so hoc sinh trong lop: "), scanf("%d", &a);
		}while( a < 1);
		    goto baitoan;
			
	}
	return 0;
}