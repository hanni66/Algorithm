"""
제출자: 김하은
"""
a = 0
for i in list(map(int, input().split())):
    a += i**2
    
print(a%10)
