"""
제출자: 김하은

소수는 1과 자기자신으로만 나뉘는수
"""
n = int(input())
num_list = list(map(int, input().split(' ')))
a = 0 # 소수의 개수를 저장할 변수

for i in num_list:
    count = 0      # 나뉘는 수의 개수를 알기 위한 변수
    for j in range(1,i+1):
        if i % j == 0:
            count += 1
    if count == 2: # 나뉘는 수가 2개면 소수
        a += 1
print(a)
