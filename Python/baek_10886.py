"""
제출자: 김하은
"""
n = int(input()) #설문조사를 한 사람 수
cute = 0
for _ in range(n):
    if int(input()) == 1:
        cute += 1
if cute > n//2:
    print("Junhee is cute!")
else:
    print("Junhee is not cute!")
