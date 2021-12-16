"""
제출자: 김하은
"""

n = int(input())

f = 1
if n == 0:
    print(f)
    
else:
    for i in range(1, n+1):
        f *= i
    print(f)
