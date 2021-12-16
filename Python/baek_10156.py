"""
제출자: 김하은

받아야 하는 돈의 액수는?
K : 과자 한 개 가격
N : 사려고 하는 과자의 개수
M : 현재 가진 돈의 액수
"""
K, N, M = map(int, input().split())
A = (K*N)-M
if A>0:
    print(A)
else:
    print(0)
