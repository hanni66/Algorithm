"""
제출자: 김하은
"""

for i in range(3):
    a = list(map(int, input().split()))
    if a.count(0) == 1:    # 도
        print("A")
    elif a.count(0) == 2:    # 개
        print("B")
    elif a.count(0) == 3:    # 걸
        print("C")
    elif a.count(0) == 4:    # 윷
        print("D")
    else:                    # 모
        print("E")
