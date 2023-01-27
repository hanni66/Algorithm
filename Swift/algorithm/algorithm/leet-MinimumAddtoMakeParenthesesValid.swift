//
//  leet-MinimumAddtoMakeParenthesesValid.swift
//  algorithm
//
//  Created by 김하은 on 2023/01/28.
//

import Foundation

func minAddToMakeValid(_ s: String) -> Int {
    var arr = s
    
    while (arr.contains("()")) {
        arr = arr.components(separatedBy: "()").joined()
    }
    
    return arr.count
}
