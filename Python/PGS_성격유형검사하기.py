# 1번 지표	라이언형(R), 튜브형(T)
# 2번 지표	콘형(C), 프로도형(F)
# 3번 지표	제이지형(J), 무지형(M)
# 4번 지표	어피치형(A), 네오형(N)

# choices
# 1 매우 비동의, 2 비동의, 3 약간 비동의
# 4 모르겠음, 5 약간 동의, 6 동의, 7 매우 동의

def solution(survey, choices):
    types = {'R':0, 'T':0, 'C':0, 'F':0, 'J':0, 'M':0, 'A':0, 'N':0}
    
    for i in range(len(choices)):
      if choices[i] < 4:
        types[survey[i][0]] += (choices[i] * 3) % 4
      if choices[i] > 4:
        types[survey[i][1]] += choices[i]% 4
    type_key = list(types.keys())
    
    answer = ''
    
    for i in range(0, len(type_key), 2):
      if types[type_key[i]] > types[type_key[i+1]]:
        answer += type_key[i]
      elif types[type_key[i]] < types[type_key[i+1]]:
        answer += type_key[i+1]
      else:
        answer += min(type_key[i], type_key[i+1])
    return answer

print('Test 1 :', solution(["AN", "CF", "MJ", "RT", "NA"], [5, 3, 2, 7, 5]))
print('Test 2 :', solution(["TR", "RT", "TR"], [7, 1, 3]))