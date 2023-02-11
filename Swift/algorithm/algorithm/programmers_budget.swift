//
//  programmers_budget.swift
//  algorithm
//
//  Created by 김하은 on 2023/02/11.
//

import Foundation

func solution(_ d:[Int], _ budget:Int) -> Int {
    var answer = 0
    var b : Int = budget
    var dd : [Int] = d.sorted()
    
    for i in dd {
        b -= i
        if (b < 0) {
            return answer
        }
        answer += 1
    }
    return answer
}
