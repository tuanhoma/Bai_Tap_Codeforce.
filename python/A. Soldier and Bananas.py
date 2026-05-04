from unittest import result

a, b, n = map(int, input().split())
tmp = 0

for i in range(1, n + 1):
    tmp += a * i

result = tmp - b
if result < 0:
    print(0)
else:
    print(result)