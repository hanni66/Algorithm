"""
제출자: 김하은
세자리수 곱셈
리스트에 넣기
append 사용
내가 작성한 코드 (런타임 에러)
bList = [] #b 리스트 만들어서 저장
b = input()
bList.append(b)
bList = map(int,bList) #리스트를 int형으로 전환
bb = int(b)
"""

A = int(input()) #정수형으로 바꿈
B = input() #문자형 그대로 둠

# 문자열의 인덱스를 이용해서 두번째 입력 받은 문자를 하나씩 숫자로 반환하고 A와 곱한다.
AxB2 = A * int(B[2])
AxB1 = A * int(B[1])
AxB0 = A * int(B[0])
AxB = A * int(B)
#파이썬은 문자열 그대로가 배열처럼 저장 되는 듯!

print(AxB2, AxB1, AxB0, AxB, sep='\n') # sep='\n'로 줄바꿈
