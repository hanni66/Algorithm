def solution(rsp):
    answer = ''
    r, s, p = '0', '2', '5'

    for i in rsp:
        if i==r:
            answer += p
        elif i==s:
            answer += r
        else:
            answer += s

    return answer