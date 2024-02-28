def solution(array):
    arr = sorted(array)
    return [arr[-1], array.index(arr[-1])]

def solution(array):
    return [max(array), array.index(max(array))]
print("Test 1 :", solution([1, 8, 3]))
print("Test 2 :", solution([9, 10, 11, 8]))