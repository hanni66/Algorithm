//
//  programmers1.swift
//  algorithm
//
//  Created by 김하은 on 2022/06/02.
//

import Foundation

//func solution(a:Int, b:Int) -> Int {
//    var sum : Int = 0
//
//    if(a == b){
//        sum += a
//        return sum
//    } else if (a<b) {
//        for i in a...b {
//            sum += i
//        }
//        return sum
//    } else {
//        for i in b...a {
//            sum += i
//        }
//        return sum
//    }
//}

func solution(_ a:Int, _ b:Int) -> Int64 {  // 수열 공식 이용
    return Int64(a + b) * Int64(max(a, b) - min(a, b) + 1) / Int64(2)
}
