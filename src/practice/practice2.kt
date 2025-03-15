package practice

data class Bidder(val money: Int?, val name: String?)

class BidderList{
    val bidders = ArrayList<Bidder>()

    fun add(bidder: Bidder?) {
        // null이 아닌 경우에만 추가
        bidder?.let{bidders.add(it)}
    }

    fun getWinner(): Bidder? {
        return bidders
            .filter { it.money != null && it.name != null }
            .minByOrNull { it.money!! } //filter로 걸렀지만 kotlin이 money:Int? 라고 인식 따라서 이 값은 절대 null이 아니다 !!로 명시
            ?.copy()
    }
}

fun main() {
    val bidderList = BidderList()
    bidderList.add(Bidder(5000, "Jack"))
    bidderList.add(Bidder(4800, "Yop"))
    bidderList.add(null)
    bidderList.add(Bidder(5200, null))
    println("Winner: ${bidderList.getWinner()}")
}



