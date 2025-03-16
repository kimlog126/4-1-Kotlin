package practice

data class Bidder(val money: Int?, val name: String?)

class BidderList{
    val bidders = ArrayList<Bidder>()

    fun add(bidder: Bidder?) {
        bidder?.let{bidders.add(it)}
    }

    fun getWinner(): Bidder? {
        return bidders
            .filter { it.name != null }
            .minByOrNull { it.money!! }
            ?.copy()
    }
}

fun main() {
    val bidderList = BidderList()
    bidderList.add(Bidder(5000, "Jack"))
    bidderList.add(Bidder(4800, "Yop"))
    bidderList.add(null)
    bidderList.add(Bidder(2200, null))
    println("Winner: ${bidderList.getWinner()}")
}



