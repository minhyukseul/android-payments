package nextstep.payments.ui.state

import nextstep.payments.data.Card

sealed interface CardUiState {
    data object Empty : CardUiState
    data class One(val card: Card) : CardUiState
    data class Many(val cards: List<Card>): CardUiState
}