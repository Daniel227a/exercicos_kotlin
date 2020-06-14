package exer10
fun main(){
    println("digite um numero ")
    var f:Float= converte(readLine()!!.toInt())
    println("os m/s sao $f")
}
fun converte(x:Int):Float{
    return ((x)/3.6).toFloat()
}
