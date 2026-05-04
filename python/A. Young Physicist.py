n = int(input())
result = 0

while n > 0:
    n -= 1
    x, y, z = map(int, input().split())
    result += x
    result += y
    result += z

if result == 0:
    print("YES")
else:
    print("NO")