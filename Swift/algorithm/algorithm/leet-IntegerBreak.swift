//
//  leet-IntegerBreak.swift
//  algorithm
//
//  Created by 김하은 on 2023/01/28.
//

import Foundation

func integerBreak(_ n: Int) -> Int {
    
    switch n {
        case 2: return 1
        case 3: return 2
    
    default:
        
        let m: Int = n / 3  // 몫
        let r: Int = n % 3  // 나머지
        
        switch r {
            case 0: return Int(pow(3, Double(m)))
            case 1: return Int(pow(3, Double(m - 1))) * 4
            
            default: return Int(pow(3, Double(m))) * r
        }
    }
    
}
