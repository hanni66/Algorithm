"""
제출자: 김하은
문제
가격을 읽을 수 없는 책의 가격을 구하는 프로그램을 작성하시오.
"""

price = int(input())
a = []

for _ in range(1, 10):
    a.append(int(input()))

print(price - sum(a))
