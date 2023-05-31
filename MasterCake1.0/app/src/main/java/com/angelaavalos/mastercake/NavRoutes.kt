package com.angelaavalos.mastercake

sealed class NavRoutes(val route: String) {
    object Home : NavRoutes("home")
    object Contacts : NavRoutes("search")
    object Favorites : NavRoutes("editNotes")
    object ShoppingCart : NavRoutes("shoppingCart")
}