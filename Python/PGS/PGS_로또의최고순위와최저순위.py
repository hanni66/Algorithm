def solution(lottos, win_nums):
    rank = [6,6,5,4,3,2,1]
    count0 = lottos.count(0)
    count = 0

    for i in win_nums:
        if i in lottos:
            count += 1 # win_num 리스트와 lottos 리스트에 겹치는 원소 카운트
    return rank[count0+count], rank[count]

print('Test 1', solution([44, 1, 0, 0, 31, 25],[31, 10, 45, 1, 6, 19]))
print('Test 2', solution([0, 0, 0, 0, 0, 0],[38, 19, 20, 40, 15, 25]))
print('Test 3', solution([45, 4, 35, 20, 3, 9],[20, 9, 3, 45, 4, 35]))
print('Test 4', solution([1, 2, 3, 4, 0, 0],[7, 8, 9, 10, 11, 12]))