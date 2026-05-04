a = list(input().lower())
b = []

for i in range(len(a)):
    if a[i] in ['a', 'o', 'y', 'e', 'u', 'i']:
        a[i] = '.'
    else:
        b.append('.')
        b.append(a[i])

result = ''.join(b)
print(result)
