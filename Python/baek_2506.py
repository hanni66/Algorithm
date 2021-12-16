"""
백준 2506
제출자: 김하은
"""
n = int(input())    # 문제의 개수
a = list(map(int, input().split()))    #채점 결과 리스트
result, p = 0, 0    # 최종결과, 가산점

for i in range(n):
    if a[i] == 0:
        p = 0
    else:
        p += 1
        result += p
print(result)
