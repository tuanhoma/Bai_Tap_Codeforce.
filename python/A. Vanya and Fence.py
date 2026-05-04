a, b = map(int, input().split())
c = list(map(int, input().split()))
result = 0

for i in range(a):
    if c[i] > b:
        result += 2
    else:
        result += 1

print(result)