"""
제출자: 김하은
1~10번역
10번역에서 모두 내린다.
기차에 사람이 가장 많을 때 사람 수를 계산
"""
p = 0 # 승객 수
max_p = 0 # 최대 승객 수

for _ in range(10):
    out, inn = map(int, input().split())
    p += inn - out
    max_p = max(p, max_p)
    
print(max_p)
