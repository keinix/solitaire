
class TableauPile(var cards: MutableList<Card> = mutableListOf()) {

    init {
        if (cards.size > 0) {
            cards.last().faceUp = true
        }
    }

    fun addCards(newCards: MutableList<Card>): Boolean {
        if (cards.size > 0) {
            if (newCards.first().value == cards.last().value - 1 &&
                    suitCheck(newCards.first(), cards.last())) {
                cards.addAll(newCards)
                return true
            }
        } else if (newCards.first().value == 12) {
            cards.addAll(newCards)
            return true
        }
         return false
    }

    fun removeCards(tappedIndex: Int) {
        for (i in tappedIndex..cards.lastIndex) {
            cards.removeAt(i)
        }
        if (cards.size > 0) {
            cards.last().faceUp = true
        }
    }

    private fun suitCheck(card1: Card, card2: Card) =
        !(blackSuit.contains(card1.suit) && blackSuit.contains(card2.suit) ||
                !(redSuit.contains(card1.suit) && redSuit.contains(card2.suit)))
}