"""
제출자: 김하은
"""

m = int(input())
n = int(input())
num = []
i = 1
while i**2 <= n: #i의 제곱이 n보다 작으면 반복
    if m <= i ** 2 <= n:  # i의 제곱이 m보다 크거나 같고 n보단 작거나 같을때
        num.append(i ** 2) # 리스트에 넣어줌
    i += 1
if num == []:
    print(-1)
else:
    print(sum(num))
    print(num[0])
