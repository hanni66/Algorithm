"""
제출자: 김하은
"""
a, b = input().split()   # 숫자 입력받기
a = int(a[::-1])    # 역순으로 만들기
b = int(b[::-1])    # 역순으로 만들기

if a > b :
    print(a)
else:
    print(b)
