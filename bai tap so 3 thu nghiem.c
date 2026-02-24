	if(1 <= n <= 1000){
	printf("nhan vat p, v, t: "); scanf("%d %d %d", &p, &v, &t);
	printf("nhan vat p1, v1, t1: "); scanf("%d %d %d", &p1 ,&v1, &t1);
	printf("nhan vat p2, v2, t2: "); scanf("%d %d %d", &p2, &v2, &t2);
	}
	else{
	    printf(" khong honp le");
	}
	if( p + v + t >= 2 ){
	    x = 1;
	}
	else{
		x = 0;
	}
	if( p1 + v1 + t1 >= 2){
		y = 1;
	}
	else{
	    y = 0;
	}
	if ( p2 + v2 + t2 >= 2){
		z = 1;
	}
	else{
		z = 0;
	}
	printf("so bai la = %d", x + y + z);
	return 0;