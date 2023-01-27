import Foundation

func largestOddNumber1(_ num: String) -> String {
    var newnum = num
    
    for i in newnum.reversed() {
        if (Int(String(i))!) % 2 == 0 {
            newnum.removeLast()
            continue
        }
        break
    }
    
    return newnum
}

largestOddNumber1("1234")
