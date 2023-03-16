//
//  baek_11723.swift
//  algorithm
//
//  Created by 김하은 on 2023/03/16.
//

import Foundation

func b11723() {
    let num = Int(readLine()!)!
    var arr = Array(repeating: 0, count: num)
    
    for _ in 1...num {
        let input = readLine()!.split(separator: " ")
        
        switch input[0] {
        case "add":
            if !arr.contains(Int(input[1])!) {
                arr.append(Int(input[1])!)
            }
            break
        case "remove":
            if arr.contains(Int(input[1])!) {
                arr = arr.filter { $0 != Int(input[1])! }
            }
            break
        case "check":
            if arr.contains(Int(input[1])!) {
                print(1)
                break
            }
            print(0)
        case "toggle":
            if arr.contains(Int(input[1])!) {
                arr = arr.filter { $0 != Int(input[1])! }
            } else {
                arr.append(Int(input[1])!)
            }
        case "all":
            arr = Array(1...20)
        case "empty":
            arr = Array(repeating: 0, count: num)
        default:
            break
            
        }
    }
}
