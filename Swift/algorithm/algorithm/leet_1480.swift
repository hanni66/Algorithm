//
//  leet_1480.swift
//  algorithm
//
//  Created by 김하은 on 2023/03/23.
//

import Foundation

class Solution1480 {
    func runningSum(_ nums: [Int]) -> [Int] {
        let nums : [Int] = nums
        var newnum = [Int](repeating: 0, count: nums.count)
        newnum[0] += nums[0]
        
        for i in 1...nums.count-1 {
            newnum[i] = newnum[i-1] + nums[i]
        }
        return newnum
    }
}
