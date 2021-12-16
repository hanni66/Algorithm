"""
백준 2711
제출자: 김하은
"""
t = int(input())

for _ in range(t):
    n, s = input().split()    # 숫자, 문자열 입력받기
    n = int(n)    # 정수형으로 바꿔주기
    print(s[:n-1] + s[n:])
