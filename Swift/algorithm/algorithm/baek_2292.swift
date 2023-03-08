//
//  baek_2292.swift
//  algorithm
//
//  Created by 김하은 on 2023/03/08.
//

import Foundation

func b2292() {
    let input = Int(readLine()!)!
    var i = 0
    var cnt = 1
    
    while true {
        cnt = cnt + 6 * i
        if input <= cnt {
            print(i + 1)
            break
        }

        i = i + 1
    }
}
