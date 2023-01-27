//
//  leet_MinimunNumberofOperation.swift
//  algorithm
//
//  Created by 김하은 on 2023/01/14.
//

import Foundation

func convertTime(_ current: String, _ correct: String) -> Int {
    var arr: [Int] = [60, 15, 5, 1]
    var count = 0
    var cur = current.components(separatedBy: ":").map{ Int($0)! }
    var newcur = cur[0]*60 + cur[1]
    var cor = correct.components(separatedBy: ":").map{ Int($0)! }
    var newcor = cor[0]*60 + cor[1]
    var newnum = newcor - newcur
    
    for i in arr {
        if newnum % i >= 0 {
            count += newnum/i
            newnum -= i * (newnum/i)
        }
    }

    return count
}
