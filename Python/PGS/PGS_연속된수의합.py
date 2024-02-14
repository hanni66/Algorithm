def solution(num, total):
    answer = []
    var = sum(range(num+1))
    diff = total - var
    start = diff//num
    answer = [i+1+start for i in range(num)]
    
    return answer