"""
제출자: 김하은
"""

t = int(input()) # 테스트 케이스


for _ in range(t):
    s = int(input()) # 가격
    n = int(input()) # 옵션의 개수
    summ = s # 옵션 가격의 합
    
    for _ in range(n):
        q,p = map(int, input().split())
        summ += q*p
        
    print(summ)
