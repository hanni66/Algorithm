"""
제출자: 김하은

문제
세 정수 A, B, C가 주어진다.
이때, 두 번째로 큰 정수를 출력하는 프로그램을 작성하시오.
"""

a,b,c = map(int, input().split())

if(a >= b):
    if(a >= c):
        if(b >= c):
            print(b)
        else:
            print(c)
    else:
        print(a)
else:
    if(b >= c):
        if(a >= c):
            print(a)
        else:
            print(c)
    else:
        print(b)
