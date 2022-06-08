//
//  baek_2869.swift
//  algorithm
//
//  Created by 김하은 on 2022/06/08.
//

import Foundation

func b2869() {
    let input = readLine()!.components(separatedBy: " ")
    
    var a : Int = Int(input[0])!
    var b : Int = Int(input[1])!
    var v : Int = Int(input[2])!
    
    var result : Int = (v-b) / (a-b)
    
    if((v-b) % (a-b) != 0) {
        result += 1
    }
    
    print(result)
}
