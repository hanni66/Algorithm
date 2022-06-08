//
//  baek_9251.swift
//  algorithm
//
//  Created by 김하은 on 2022/06/08.
//

import Foundation

func b9251() {
    let s1: [String] = [" "] + readLine()!.map{String($0)}
    let s2: [String] = [" "] + readLine()!.map{String($0)}
    
    let m = s1.count - 1
    let n = s2.count - 1
    
    var arr: [[Int]] = Array(repeating: Array(repeating: 0, count: n + 1), count: m + 1)

    for i in 1...m {
        for j in 1...n {
            if (s1[i] == s2[j]) {
                arr[i][j] = arr[i - 1][j - 1] + 1
            }
            else {
                arr[i][j] = max(arr[i - 1][j], arr[i][j - 1])
            }
        }
    }
    print(arr[m][n])
}
