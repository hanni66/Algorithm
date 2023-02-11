//
//  leet-MinimumDominoRotationsForEqualRow.swift
//  algorithm
//
//  Created by 김하은 on 2023/01/28.
//

import Foundation

func minDominoRotations(_ tops: [Int], _ bottoms: [Int]) -> Int {
    var topArr = tops.sorted(), botArr = bottoms.sorted()
    var newTop : [Int]
    var newBot : [Int]
    var num1 : Int = 0
    var num2 : Int = 0
    
    for i in topArr {
        if botArr.contains(i) {
            newTop = topArr.filter { $0 != i }
            newBot = botArr.filter { $0 != i }
            
            num1 = newTop.count
            num2 = newBot.count
        }
    }
    
    if num1 == num2 {
        return num1
    } else if num1 < num2 {
        return num1
    } else {
        return -1
    }
}
