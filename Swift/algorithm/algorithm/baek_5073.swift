//
//  baek_5073.swift
//  algorithm
//
//  Created by 김하은 on 2023/03/01.
//

import Foundation

func b5073() {
    while true {
        let input = readLine()!.split(separator: " ").map{ Int($0)! }
        let newarr = input.sorted()

        let x = newarr[0]
        let y = newarr[1]
        let z = newarr[2]
        
        if x == 0 && y == 0 && z == 0 {
            break
        }
        
        if z < x+y {
            if x == y && y == z {
                print("Equilateral")
            } else if x == y || y == z || x == z {
                print("Isosceles")
            } else if x != y && y != z {
                print("Scalene")
            }
        } else  {
            print("Invalid")
        }
    }
}
