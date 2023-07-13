var good: String ="."
var price: Int = 0
var totalPrice: Int = 0
var goods: String = "###################\nЧЕК ЗА ПОКУПКУ\n"

fun main() {
    getGoodsList()
    getSold(goods,totalPrice)
}

fun getSold(goods: String, totalPrice: Int){
    println(goods)
    println("Общая сумма покупки: $totalPrice")
}

fun getGoodsList(){
    while (good!=""){
        println("Введите название товара")
        good = readln()
        if (good=="") break
        println("Введите его цену")
        price = readln().toInt()
        totalPrice += price
        goods = ("$goods $good цена:$price\n").toString()
    }
}
