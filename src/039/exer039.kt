package `039`

import kotlin.random.Random
import com.sun.xml.internal.fastinfoset.util.StringArray as StringArray

fun main(){
    val salario :Float= 780.0F


    var cont:Int=0

    //vetor de String

    var nomes =Array<String?>(3){null}

    do {
        println("digite o nome")
      nomes[cont]= readLine()!!.toString()
        cont++
    } while (cont<3)




}
//numero aleatorio kotlin
fun numero_aleatorio():List<Int>{
    var x:Int=0
    do {


    }
    val numero_aleatori= List(3){ Random.nextInt(0,2)}

}


