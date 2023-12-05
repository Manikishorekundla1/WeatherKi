package uk.ac.tees.w9613019.weatherki.Components

import android.annotation.SuppressLint
import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@SuppressLint("SuspiciousIndentation")
@OptIn(ExperimentalComposeUiApi::class, ExperimentalMaterial3Api::class)
@Composable
fun loginPage() {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    val context = LocalContext.current
    val control = LocalSoftwareKeyboardController.current



        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(5.dp)
        ) {

            OutlinedTextField(value = email,
                onValueChange = { email = it },
                singleLine = true,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(30.dp))

            Spacer(modifier = Modifier.height(10.dp))

            OutlinedTextField(
                value = password,
                onValueChange = { password = it },
                singleLine = true,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(40.dp)
            )
            Spacer(modifier = Modifier.height(10.dp))

            Row( horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Button(
                    onClick = {
                        Toast.makeText(
                            context, "Logging in",
                            Toast.LENGTH_SHORT
                        ).show()
                    },
                    modifier = Modifier
                        .width(150.dp)
                        .height(100.dp)
                ) {
                    Text(text = "Login")

                }

                Button(
                    onClick = {
                        Toast.makeText(
                            context, "Redirecting to Register",
                            Toast.LENGTH_SHORT
                        ).show()
                    },
                    modifier = Modifier
                        .width(150.dp)
                        .height(100.dp)
                ) {
                    Text(text = "Register")
                }
            }

        }

    }

@Preview
@Composable
fun loginPreview()
{
    loginPage();
}