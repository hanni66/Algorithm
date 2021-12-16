"""
제출자: 김하은

사분면 별로 점이 있는지 확인하기
"""

n = int(input())  #몇 번 할 것인지
Q1 = Q2 = Q3 = Q4 = AXIS = 0

for _ in range(n): # 영역 별로 저장하기
    x, y = map(int, input().split())
    if x == 0 or y == 0: #축 위에 있는 점
        AXIS += 1
    elif x > 0 and y > 0: #제 1사분면 위에 있는 점
        Q1 += 1
    elif x < 0 and y > 0: #제 2사분면 위에 있는 점
        Q2 += 1
    elif x < 0 and y < 0: #제 3사분면 위에 있는 점
        Q3 += 1
    elif x > 0 and y < 0: #제 4사분면 위에 있는 점
        Q4 += 1

print("Q1: %d" %(Q1))
print("Q2: %d" %(Q2))
print("Q3: %d" %(Q3))
print("Q4: %d" %(Q4))
print("AXIS: %d" %(AXIS))
