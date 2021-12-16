"""
제출자: 김하은
A, B 투표
입력
심사위원 수
누구한테 투표했는지
출력
A>B -> A // A<B -> B //A==B -> Tie
"""
v = int(input()) #심사위원 수
v_list = list(str(input())) # 개표
a = 0
b = 0
for i in v_list:
    if i == 'A':
        a += 1
    else:
        b += 1
if a < b :
    print('B')
elif a == b :
    print('Tie')
else:
    print('A')
