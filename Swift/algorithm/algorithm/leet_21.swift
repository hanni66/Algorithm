//
//  leet_21.swift
//  algorithm
//
//  Created by 김하은 on 2023/04/06.
//

import Foundation
//public class ListNode {
//    public var val: Int
//    public var next: ListNode?
//    public init() { self.val = 0; self.next = nil; }
//    public init(_ val: Int) { self.val = val; self.next = nil; }
//    public init(_ val: Int, _ next: ListNode?) { self.val = val; self.next = next; }
//}


class Solution21 {
    func mergeTwoLists(_ list1: ListNode?, _ list2: ListNode?) -> ListNode? {
        let check = ListNode(0)
        var result: ListNode? = check
        // 포인터
        var p: ListNode? = list1
        var q: ListNode? = list2
        
        while p != nil && q != nil {
            if p!.val <= q!.val { // p가 q보다 작거나 같으면 새로운 listnode에 p를 추가한다.
                result?.next = p
                p = p?.next
            } else {    // p가 q보다 크면 새로운 listnode에 q를 추가한다.
                result?.next = q
                q = q?.next
            }
            result = result?.next
        }
        
        // 합쳐진 리스트의 마지막 노드 다음에 p 나 q 리스트의 남은 노드를 추가
        if p != nil {
            result?.next = p
        } else {
            result?.next = q
        }
        
        return check.next
    }
}
