"""
제출자: 김하은
입력
N의 개수가 주어짐
N개 만큼의 r(광고X수익), e(광고O수익), c(광고비용)가 주어짐
출력
광고필요O -> "advertise"
광고필요X -> "do not advertise"
수익차이X -> "dose not matter"
"""
n = int(input())
for i in range(n):
    r, e, c = map(int, input().split())
    if e-c < r :
        print("do not advertise")
    elif e-c == r:
        print("does not matter")
    else:
        print("advertise")
