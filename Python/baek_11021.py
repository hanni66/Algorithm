"""
제출자: 김하은
"""

t = int(input()) #테스트 케이스 개수

for i in range(t):
    a,b = map(int, input().split())
    plus = a + b
    print("Case #%s: %s" %(i+1, plus))
