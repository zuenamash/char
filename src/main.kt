fun main() {
    var cumpus = "Akirachix"
    var char1 = "cumpus{0}"
    var char2 = "college{2}"
    var char3 = "college{3}"
    println((char1.toString() + char2 + char3))

    var z = nameage("zuenah", 19)
    println(z)
    message("i am looking forward to kotlin can't wait to gain skills.")


}
fun nameage(x:String,y:Int):String{
    var word=("Hi, my name is $x and i am $y years old")
    return word
}
fun message(a:String):String{
    var statement ={"the length of the statement is"+a.length}
    println(statement)

    var name="Zuenah"

    if(name=="mary")
        println("thats me")
    else {
        println("i dont know who that is")

    }











