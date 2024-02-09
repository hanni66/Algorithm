"""
제출자: 김하은
"""
m = int(input()) #숫자 입력문
n = int(input()) #숫자 입력문
s = [] #소수를 저장할 리스트

for i in range(m, n+1):     # M과 N 사이를 반복
    count = 0               # 나눠지는 개수를 저장하기 위한 변수
    for j in range(1, i+1):
        if i % j == 0:
            count += 1
            if count > 2:     # 2보다 크면 소수가 아니니까 탈출
                break
    if count == 2:    #count가 2와 같다면 소수
        s.append(i)
if len(s) != 0:    # 소수를 저장한 리스트에 값이 있다면
    print(sum(s)) #리스트의 값의 합을 출력
    print(s[0]) #소수값중 최솟값을 출력
else:     # 소수가 하나도 없다면
    print("-1") #-1출력
