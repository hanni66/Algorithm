"""
제출자: 김하은

(꼭짓점의 수) - (모서리의 수) + (면의 수) = 2
"""

t = int(input())

for i in range(t):
    a, b = map(int, input().split())
    c = 2-a+b
    print(c)
