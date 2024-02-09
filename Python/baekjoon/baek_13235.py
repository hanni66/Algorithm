"""
백준 13235
제출자: 김하은
"""

n = input() # 단어 입력문

a = list(n)  #list로 문자열 하나씩 저장
b = list(n)[::-1]  #list로 받은 문자열 역출력

if (a == b): # a와 b가 같으면
    print("true") #true 출력
else: # 아닐때
    print("false") #false 출력
