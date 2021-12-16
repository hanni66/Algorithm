"""
제출자: 김하은
"""
n = []

for i in range(7):
    num = int(input())
    if num%2 != 0:
        n.append(num)
        
if len(n) != 0:
    print(sum(n))
    print(min(n))
else:
    print(-1)
