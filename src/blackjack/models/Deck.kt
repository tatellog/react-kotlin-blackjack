package blackjack.models

class Deck {
    private val cards = mutableListOf<Card>()

    init {
        generateDeck()
        shuffleDeck()
    }

    private fun generateDeck() {
        for (suit in Suits) {
            for (face in Faces) {
                cards.add(Card(face, suit))
            }
        }
    }


    private fun shuffleDeck() {
        cards.shuffle()
    }


    fun draw(): Card {
        return cards.removeAt(cards.lastIndex)
    }

}