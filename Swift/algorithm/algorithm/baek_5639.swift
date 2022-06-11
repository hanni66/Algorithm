//
//  baek_5639.swift
//  algorithm
//
//  Created by 김하은 on 2022/06/11.
//

import Foundation

func b5639() {
    var binaryList = [Int]()

    while let input = readLine(), let n = Int(input) {
        binaryList.append(n)
    }

    func binarySearch(start: Int, end: Int, target: Int) -> Int {
        var start = start, end = end
        
        while start < end {
            let mid = (start + end)/2
            if target < binaryList[mid] {
                end = mid
            } else {
                start = mid + 1
            }
        }
        return start
    }

    func postOrder(startt: Int, endd: Int) {
        if startt >= endd {
            return
        }
        
        let select = binarySearch(start: startt+1, end: endd, target: binaryList[startt])
        postOrder(startt: startt+1, endd: select)
        postOrder(startt: select, endd: endd)
        print(binaryList[startt])
    }

    postOrder(startt: 0, endd: binaryList.count)
}

b5639()
