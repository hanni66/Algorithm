def solution(babbling):
    answer = 0
    list = ["aya", "ye", "woo", "ma"]

    for i in babbling:
        for j in list:
            if j*2 not in i:
                i = i.replace(j, ' ')
        if len(i.strip()) == 0:
            answer += 1
    return answer