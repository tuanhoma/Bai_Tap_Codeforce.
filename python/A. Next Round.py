k, n = map(int, input().split())
a = list(map(int, input().split()))

result = 0

for i in range(k):
    if a[i] > 0 and a[i] >= a[n - 1]:
        result += 1

print(result)