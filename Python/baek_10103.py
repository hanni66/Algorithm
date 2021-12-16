"""
제출자: 김하은
"""

n = int(input())
a = b = 100

for _ in range(n):
    x, y = map(int, input().split())
    if x > y:
        b -= x
    elif x < y:
        a -= y

print(a, b, sep = "\n")
