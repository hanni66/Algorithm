//
//  leet_PalindromeNumber.swift
//  algorithm
//
//  Created by 김하은 on 2022/06/29.
//

import Foundation

class Solution9 {
    func isPalindrome(_ x: Int) -> Bool {
        let text : String = String(x)
        let reText: [Character] = String(x).reversed()
        let result = text == String(reText)
        
        return result
    }
}
