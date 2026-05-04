a = list(input())
count_lower = 0
count_upper = 0

for i in range(len(a)):
    if a[i].islower():
        count_lower += 1
    else:
        count_upper += 1

result = ""
if count_lower > count_upper:
    result = ''.join(a).lower()
elif count_lower < count_upper:
    result = ''.join(a).upper()
else:
    result = ''.join(a).lower()

print(result)