"""
제출자: 김하은

문제
두 양의 정수가 주어졌을 때,
첫 번째 수가 두 번째 수보다 큰지 구하는 프로그램을 작성하시오.

출력
각 테스트 케이스마다, 첫 번째 수가 두 번째 수보다 크면 Yes를,
아니면 No를 한 줄에 하나씩 출력한다.
"""
a, b = map(int, input().split())

while not (a==0 and b==0):
    if a>b :
        print('Yes')
    else:
        print('No')
    a, b = map(int, input().split())
