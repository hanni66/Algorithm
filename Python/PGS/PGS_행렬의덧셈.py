import numpy as np

def solution(arr1, arr2):
    arr1 = np.array(arr1)
    arr2 = np.array(arr2)
    answer = arr1+arr2
    return answer.tolist()

def solution(arr1, arr2):
    print(list(x) for x in zip(arr1, arr2))
    return [list(map(sum, zip(*x))) for x in zip(arr1, arr2)]

print('Test 1 :', solution([[1,2],[2,3]], [[3,4],[5,6]]))
print('Test 2 :', solution([[1],[2]], [[3],[4]]))