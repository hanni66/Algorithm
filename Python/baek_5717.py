"""
제출자: 김하은
"""

m, f = map(int, input().split())
while not (m == 0 and f == 0): #마지막은 0 0을 입력하니까
    print(m+f)
    m, f = map(int, input().split())
