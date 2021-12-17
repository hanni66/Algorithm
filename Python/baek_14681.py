"""
백준 14681
제출자: 김하은
"""

x= int(input()) #x좌표 입력받기
y= int(input()) #y좌표 입력받기

if (x>0 and y>0): #x가 0보다 크고 y도 0보다 클때
    print("1") #1사분면 출력
elif (x<0 and y>0): #x가 0보다 작고 y가 0보다 클때
    print("2") #2사분면 출력
elif (x<0 and y<0): #x가 0보다 작고 y가 0보다 작을때
    print("3") #3사분면 출력
elif (x>0 and y<0): #x가 0보다 크고 y가 0보다 작을때
    print("4") #4사분면 출력
else: #0,0일때
    print("no") #0,0은 사분면에 포함되지 않으니 no출력
