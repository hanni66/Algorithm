//
//  baek_1476.swift
//  algorithm
//
//  Created by 김하은 on 2022/07/20.
//

import Foundation

func b1476() {
    let input = readLine()!.split(separator: " ").map{ Int($0)! }
    var e = 1
    var s = 1
    var m = 1
    var answer = 1
    
    while true {
        if e > 15 {
            e = 1
        }
        if s > 28 {
            s = 1
        }
        if m > 19 {
            m = 1
        }
        if input[0] == e && input[1] == s && input[2] == m {
            break
        }
        answer += 1
        e += 1
        s += 1
        m += 1
    }
    print(answer)
}
