"""
제출자: 김하은
별찍기
"""
n = int(input())

for i in range(1, n+1):
    print(' '*(n-i)+'*'*((2*i)-1))
