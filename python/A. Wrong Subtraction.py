n, k = map(int, input().split())

while k > 0:
    tmp = n % 10
    if tmp != 0:
        if k >= tmp:
            k -= tmp
            n -= tmp
        else:
           n -= k
           k = 0
    else:
        n /= 10
        k -= 1

print(n.__int__())





