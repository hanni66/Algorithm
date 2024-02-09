"""
제출자: 김하은

도미노
2
(0,1),(0,2),(1,1),(1,2),(2,2)
"""
n = int(input())
summ = 0

for i in range(0, n+1):
    for j in range(i, n+1):
        summ += i + j
print(summ)
