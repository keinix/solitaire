val clubs = "Clubs"
val diamonds = "Diamonds"
val hearts = "Hearts"
val spades = "Spades"

val redSuit = arrayOf(diamonds, hearts)
val blackSuit = arrayOf(clubs, spades)

data class Card(val value: Int, val suit: String, var faceUp: Boolean = false)


