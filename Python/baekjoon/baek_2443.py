"""
제출자: 김하은
별찍기
"""
n = int(input())

for i in range(n, 0, -1):
    print(' '*(n-i)+'*'*((2*i)-1))
