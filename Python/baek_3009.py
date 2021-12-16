"""
제출자: 김하은

네번째 점
3개의 좌표가 주어졌을때
좌표에 평행하는 직사각형 만들기
"""
x_list = []
y_list = []

for _ in range(3):
    x, y = map(int, input().split())
    x_list.append(x)
    y_list.append(y)

for i in range(3):
    if x_list.count(x_list[i]) == 1:
        x = x_list[i]
    if y_list.count(y_list[i]) == 1:
        y = y_list[i]

print(x, y)
