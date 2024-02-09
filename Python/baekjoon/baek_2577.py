"""
백준 2577
제출자: 김하은
"""
A = int(input()) #자연수 A 입력받기
B = int(input()) #자연수 B 입력받기
C = int(input()) #자연수 C 입력받기

M = list(str(A*B*C)) #A*B*C의 값을 문자열로 변환 후 리스트에 저장

for i in range(10): # 0부터 9까지 숫자가 몇번 쓰였는지 알기 위해 10번 반복하기
    print(M.count(str(i))) #문자열 i가 몇개 포함되어 있는지 계산해 반환해 출력 (ex)) i가 1일때  => M값에 0이 몇개 있는지 반환)
