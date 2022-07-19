//
//  baek_4673.swift
//  algorithm
//
//  Created by 김하은 on 2022/07/19.
//

import Foundation

func b4673() {

    var array = [Int]()
    var answer = Set<Int>()

    for i in 1...10000{
        answer.insert(i)
        array.append(selfNumber(String(i)))
    }
                   
    var temp = Set(array)
    answer.subtract(temp)
    for i in answer.sorted(){
        print(i)
    }
}

func selfNumber(_ n:String)->Int{
    var num = Int(n)!
    for i in n{
        num += Int("\(i)")!
    }
    return num
}
