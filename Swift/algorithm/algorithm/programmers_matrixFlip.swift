//
//  programmers_matrixFlip.swift
//  algorithm
//
//  Created by 김하은 on 2023/02/18.
//

import Foundation

func solutionMatrixFlip(_ rows:Int, _ columns:Int, _ queries:[[Int]]) -> [Int] {
    
    var arr = [[Int]](repeating: Array(repeating: 0,count:columns), count: rows)
    
    // 배열 채우기
    var temp = 1
    for i in 0..<arr.count {
        for j in 0..<arr[i].count {
            arr[i][j] = temp
            temp += 1
        }
    }
    print(arr)
    
    // 배열에 맞춰주기 위해 -1을 해준다!! 배열은 0부터 시작하니까..
    let queries = queries.map({ $0.map({i in i - 1}) })
    
    for i in queries {
        var tempArr: [Int] = []
        for j in i[1]..<i[3]{}
    }
    return []
}
// 0 1 2 3 -> 번째
// 1 1 4 3 -> i
// 1~3 -> 북쪽
// 1~4 -> 동쪽
// 3~1 -> 남쪽
// 4~1 -> 서쪽

// array i => [4, 3, 10, 5, 68]
// for i in i[0]...i[2]  ==>  i[0], i[1], i[2]
// 4, 3, 10
// 4 ~ 10
// [8, 12,3,31,231,23,1,]
// [14, ㅁㄴㅇㄹㅁ,ㄹㅁ,ㅇㄴㄹ,ㅁㄴㅇ,ㄹㅁㅇ,ㄹㄴㅁ,]

// 0 1 2 3 -> 번째
// 2 2 5 5 -> i




