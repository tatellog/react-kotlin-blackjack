package blackjack.models

class Hand() {
    var cards: ArrayList<Card>

    init {
        cards = ArrayList()
    }

    fun addCard(card: Card) {
        cards.add(card)
    }

    // Compute the value of a hand of cards.
    fun handValue(): Int {
        /*var value = 0
        for (card in hand)
            value += card.value()
        */
        return cards.sumBy { it.value() }
    }

    fun clean() {
        cards = ArrayList<Card>()
    }

}
