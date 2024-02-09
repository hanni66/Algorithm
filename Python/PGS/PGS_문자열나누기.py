def solution(s):
    answer = 0
    x, y = 0, 0

    for i in s:
        if x == y:
            answer += 1
            k = i
        if k == i:
            x += 1
        else:
            y += 1
    return answer