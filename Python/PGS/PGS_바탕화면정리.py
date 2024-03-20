# 2차원 배열 이용
# def solution(wallpaper):
#     wallpaper = [[1 if char == '#' else 0 for char in row] for row in wallpaper]
#     search_file = []

#     for x, row in enumerate(wallpaper):
#         for y, value in enumerate(row):
#             if value == 1:
#                 search_file.append((x, y))
#     lux, luy, rdx, rdy = min(i[0] for i in search_file), min(i[1] for i in search_file), max(i[0] for i in search_file), max(i[1] for i in search_file)

#     return [lux, luy, rdx+1, rdy+1]

# x, y값을 일차원 배열에 저장해 최소, 최대값을 찾아내 리턴
def solution(wall):
    x, y = [], []
    for i in range(len(wall)):
        for j in range(len(wall[i])):
            if wall[i][j] == "#":
                x.append(i)
                y.append(j)
    return [min(x), min(y), max(x) + 1, max(y) + 1]

print("Test 1 :", solution([".#...", "..#..", "...#."]))
print("Test 2 :", solution(["..........", ".....#....", "......##..", "...##.....", "....#....."]))
print("Test 3 :", solution([".##...##.", "#..#.#..#", "#...#...#", ".#.....#.", "..#...#..", "...#.#...", "....#...."]))
print("Test 4 :", solution(["..", "#."]))