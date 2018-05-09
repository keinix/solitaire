object GamePresenter {
    var view: GameView? = null

    fun onDeckTap() = GameModel.onDeckTap()

    fun setGameView(gameView: GameView) {
        view = gameView
        view?.update()
    }

    fun onWasteTap() {
        GameModel.onWasteTap()
        view?.update()
    }

    fun onFoundtationTab(foundationIndex: Int) {
        GameModel.onFoundtationTab(foundationIndex)
        view?.update()
    }

    fun onTableauTaped(tableauIndex: Int, cardIndex: Int) {
        GameModel.onTableauTaped(tableauIndex, cardIndex)
        view?.update()
    }
}
