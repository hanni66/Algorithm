import Foundation

class Solution {
    let strs = ["flower","flow","flight"]
    
    func longestCommonPrefix(_ strs: [String]) -> String {
        var new = ""
        
        for i in 0..<strs.count {
            if (strs[i].startIndex == strs[i+1].startIndex){
                new.append(String(strs[i].startIndex))
            }
        }
        
        return new
    }
}
