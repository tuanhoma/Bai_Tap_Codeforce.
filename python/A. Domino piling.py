from difflib import Match

import math

m, n = map(int, input().split())
result = math.floor((m * n) / 2)
print(result)