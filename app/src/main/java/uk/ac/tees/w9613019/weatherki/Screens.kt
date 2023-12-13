package uk.ac.tees.w9613019.weatherki

sealed class Screens(val route:String) {
    object Login:Screens("Login")
    object Register:Screens("Register")
    object HomeScreen:Screens("Home")
}