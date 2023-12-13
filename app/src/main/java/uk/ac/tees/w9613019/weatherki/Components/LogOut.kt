package uk.ac.tees.w9613019.weatherki.Components


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

import androidx.compose.ui.tooling.preview.Preview

@Composable
fun LogOut()
{
    Row(verticalAlignment = Alignment.Bottom, horizontalArrangement = Arrangement.End){
        Button(onClick = { /*TODO*/ }) {
            Text(text = "LogOut")

        }
    }
}
@Preview
@Composable
fun rlog()
{
    LogOut()
}