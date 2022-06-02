//
//  baek_2480.swift
//  algorithm
//
//  Created by 김하은 on 2022/06/02.
//

import Foundation

func b2480() {
    let input = readLine()!.components(separatedBy: " ")
    
    var a : Int = Int(input[0])!
    var b : Int = Int(input[1])!
    var c : Int = Int(input[2])!
    
    if (a == b && b == c) {
        print(10000+a*1000)
    }
    else if (a == b) {
        print(1000+a*100)
    }
    else if (a == c) {
        print(1000+a*100)
    }
    else if (b == c) {
        print(1000+b*100)
    }
    else {
        print(100 * max(a,b,c))
    }
}
