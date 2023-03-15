fun main(args: Array<String>) {

    print("enter your age")
    var age:Int = readLine() !!.toInt()
    println(age)



    if (age >= 18) {
        print("welcome to the club")
    }else {
        print("Sorry we don't admit under age")
    }


}