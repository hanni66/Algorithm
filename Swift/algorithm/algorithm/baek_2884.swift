//
//  baek_2884.swift
//  algorithm
//
//  Created by 김하은 on 2022/06/02.
//

import Foundation

func b2884() {
    let input = readLine()!.components(separatedBy: " ")
    
    var h : Int = Int(input[0])!
    var m : Int = Int(input[1])!
    
    if (m >= 45) {
        print(h, m-45)
    }
    else if (m < 45 && h > 0) {
        m = m + 15
        h = h - 1
        print(h, m)
    }
    else {
        print(23, m+15)
    }
}
