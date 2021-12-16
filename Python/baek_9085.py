"""
제출자: 김하은
"""
t = int(input())

for i in range(t):
    n = int(input())    # 자연수의 개수 입력받기
    num = list(map(int, input().split()))
    print(sum(num))
