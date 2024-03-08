package a_basic.classAndProperties

fun main(args: Array<String>) {
    val item = Item("아이템", 3000)
    println("Item name is ${item.name} and price is ${item.price}")

    val itemTrade = ItemTradeImpl("아이템2", 4000)
    itemTrade.buy()
    itemTrade.sell()
}

// 아래처럼 클래스를 정의하면 생성자도 자동으로 정의됨
class Item(
    val name: String,
    val price: Int
)

class ItemTradeImpl(
    private val name :String,
    private val price: Int
) : ItemTrade {
    override fun buy() {
        println("[buy] $name")
    }

    override fun sell() {
        println("[sell] $name")
    }
}

interface ItemTrade {
    fun buy()
    fun sell()
}