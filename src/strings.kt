fun main() {
text()
    var smart=join("jane",24)
    println(smart)
    println(name("girl"))
    println(first("jane"))
}
fun text() {
    var school="akirachix"
    var f=school [0]
    var g=school [2]
    var h=school [3]
    println("$f$g$h")
}
fun join(name:String,age:Int):String{
    var name="Hi my name is $name I am $age years old"
    return(name)


}
fun name(word:String){
    println(word.length)
}
fun first(name: String){
    if(name=="jane"){
        println("That's me")
    }else
        println("I don't know that is")

}
