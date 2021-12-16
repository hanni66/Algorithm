"""
백준 2455
제출자: 김하은
"""

n = [] # 사람들의 수 저장
p = 0 # 사람들의 수

for _ in range(4) :
    out, inn = map(int,input().split())
    p += inn #타는 사람
    p -= out #내리는 사람

    n.append(p) #종착역 마다의 사람 수 추가
    
print(max(n))
