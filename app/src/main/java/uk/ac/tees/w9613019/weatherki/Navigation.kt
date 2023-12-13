package uk.ac.tees.w9613019.weatherki

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController

@Composable
fun Navigate()
{
    val navController= rememberNavController()
    NavHost(navController = navController, startDestination =Screens.Login.route)
    {

    }

}