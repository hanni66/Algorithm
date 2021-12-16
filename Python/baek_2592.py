"""
백준 2592
제출자: 김하은
평균과 최빈값 구하기
"""

a = [int(input()) for i in range(10)]    # 입력받기
print(sum(a)//10)
print(max(a, key = a.count))
