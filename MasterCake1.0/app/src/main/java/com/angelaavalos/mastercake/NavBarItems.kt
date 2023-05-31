package com.angelaavalos.mastercake

import androidx.compose.material.icons.*
import androidx.compose.material.icons.filled.*

object NavBarItems {
    val BarItems = listOf(
        BarItem(
            title = "Home",
            image = Icons.Filled.Home,
            route = "home"
        ),
        BarItem(
            title = "search",
            image = Icons.Filled.Search,
            route = "search"
        ),
        BarItem(
            title = "EditNotes",
            image = Icons.Filled.EditNote,
            route = "editNotes"
        ),
        BarItem(
            title = "Shopping cart",
            image = Icons.Filled.ShoppingCart,
            route = "shoppingCart"
        )

    )
}