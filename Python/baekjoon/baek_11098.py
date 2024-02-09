"""
제출자: 김하은
문제
당신의 임무는 첼시가 리스트에서 가장 비싼 선수를 찾아낼 수 있도록 돕는 것이다.
"""

n = int(input()) # 테스트 케이스 개수

for _ in range(n):
    p = int(input()) # 고려해야될 선수의 수
    cmax = 0            # 가장 비싼 가격
    mName = " "        # 가장 비싼 선수
    for _ in range(p):
        c, name = input().split() # 가격, 이름 입력받기
        c = int(c) #가격 int형으로 저장
        if (c > cmax):
            cmax = c
            mName = name
    print(mName)
