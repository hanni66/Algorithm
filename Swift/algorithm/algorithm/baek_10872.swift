//
//  baek_10872.swift
//  algorithm
//
//  Created by 김하은 on 2022/06/10.
//

import Foundation

func b10872() {
    let n = Int(readLine()!)!
    
    if n == 0 {
        print(1)
        exit(0)
    }
    var f = 1
    
    for i in 1...n {
        f *= i
    }
    
    print(f)
}
