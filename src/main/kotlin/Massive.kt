class Massive {

    private var good: String ="."
    private var price: Int = 0
    private var totalPrice: Int = 0
    private var goods: String = "\n______________\nЧЕК ЗА ПОКУПКУ\n"

    fun main(){
        getGoodsList()
        getSold(goods,totalPrice)
    }

    fun getSold(goods: String, totalPrice: Int){
        println(goods)
        println("Сумма: $totalPrice")
    }

    private fun getGoodsList(){
        while (good!=""){
            println("Введите название товара")
            good = readln()
            if (good=="")break
            println("Введите его цену")
            price = readln().toInt()
            totalPrice += price
            goods = ("$goods$good цена:$price\n")
        }
    }
}

fun main(){
    Massive().main()
}