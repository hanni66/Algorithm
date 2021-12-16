"""
제출자: 김하은

문제: 주사위 3개를 던져서 같은 눈에 따라 상금이 달라짐
입력: 첫 줄에 몇 명이 게임하는지 입력 받기
     인원 수 만큼의 주사위 눈 보이기
출력: 가장 높은 상금
"""
n = int(input()) #인원수 입력받기
m = 0 #상금
max_m = 0 #가장 큰 상금
for _ in range(n): #인원수만큼 반복하기
    x,y,z = map(int, input().split())
    if x == y == z: #주사위 눈 비교
        m = 10000+(x*1000)
    elif x == y:
        m = 1000+(x*100)
    elif x == z:
        m = 1000+(x*100)
    elif y == z:
        m = 1000+(y*100)
    else:
        m = max(x, y, z)*100
    
    if max_m < m: #상금 비교
        max_m = m

print(max_m) #출력
