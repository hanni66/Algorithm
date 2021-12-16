"""
제출자: 김하은
"""
n = int(input())
a, b = 0, 1    # 피보나치 계산하기 위해 초기값 넣어줌

for i in range(n):
    a, b = b, a+b    # a에 b를 넣고, b에는 a+b를 넣는다
    
print(a)
