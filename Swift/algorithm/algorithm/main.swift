// 문제 연습
import Foundation

class Study {                                                   // 클래스 생성
    var className: String
    var num: Int
    
    init(className:String, num:Int){                              // 초기화
        self.className = className
        self.num = num
    }

    func changeName(className: String){    // class 이름 바꾸기
        self.className = className
    }

    func printName() {                                       // 출력문
        print("I'm studying \(num) : \(className).")
    }
}

let study1 = Study(className: "iOS", num: 1)
study1.printName()
// I'm studying 1 : iOS.

let study2 = Study(className: "Java", num: 2)
study2.changeName(className:"C")
study2.printName()
// I'm studying 2 : C.

class schoolStudy: Study {                            // Study 클래스 상속
    var schoolNum = 0

    override func printName() {
        super.num = 3
        print("I like \(schoolNum) : \(className).")
    }
}

let study3 = schoolStudy(className: "Math", num: 0)
study3.printName()
// I like 0 : Math.
