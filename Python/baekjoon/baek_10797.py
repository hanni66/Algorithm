"""
백준 10797
제출자: 김하은
"""
n = int(input())   # 날짜의 일의 자리 숫자
c = list(map(int, input().split()))    # 자동차 번호의 일의 자리수
count = 0 # 시행하는 자동차 수

for i in c:
    if i == n:
        count += 1
    
print(count)
