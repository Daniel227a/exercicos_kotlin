fun main() {
    println("digite ")
    var str3 = readLine()!!.toString()

    //var str = Array<Char?>(str3.length - 1) { null }
    var tamanho = str3.length -1
    var cont = 0;
    var str2 = Array<Char?>(tamanho+1) { null }
    do {

        str2[cont] = str3.get(tamanho)
        tamanho = tamanho - 1
        cont++
    } while (tamanho >-1)
    for (i in str2) {
        print(i)

    }

}