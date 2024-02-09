def solution(babbling):
    answer = 0
    can = ['aya', 'ye', 'woo', 'ma']
    
    for i in babbling:
        for c in can:
            if c * 2 not in i:
                i = i.replace(c, ' ')
                
        if i.isspace():
            answer += 1
            
    return answer
