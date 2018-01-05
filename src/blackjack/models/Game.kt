package blackjack.models

class Game() {
    var ph: Hand = Hand()
    var dh: Hand = Hand()
    private val deck = Deck()

    init {
        ph.addCard(deck.draw())
        ph.addCard(deck.draw())

        dh.addCard(deck.draw())
        dh.addCard(deck.draw())
    }

    fun deal() {
        ph.clean()
        ph.addCard(deck.draw())
        ph.addCard(deck.draw())

        dh.clean()
        dh.addCard(deck.draw())
        dh.addCard(deck.draw())
    }

    fun hit() {
        ph.addCard(deck.draw())
    }

    fun stay() {
        if (dh.handValue() <= 17) {
            dh.addCard(deck.draw())
        }
    }

}