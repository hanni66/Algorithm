//
//  programmers_lottos.swift
//  algorithm
//
//  Created by 김하은 on 2023/02/18.
//

import Foundation

func solutionLottos(_ lottos:[Int], _ win_nums:[Int]) -> [Int] {
    
    var lotto = lottos.sorted()
    var win = win_nums.sorted()
    var count = 0
    var check = 0
    
    
    for i in lotto {
        if i == 0 {
            count += 1
        }
        for j in win {
            if i == j {
                check += 1
            }
        }
    }
    
    
    if count == 6 {
        return [1, 6]
    } else if count < 6 {
        if check < 6 {
            if check == 0 {
                return [6,6]
            }
            return [7-(check+count), 7-check]
        } else {
            return [7-count, 6]
        }
    }
    
    return [7-check, 7-check]
}
