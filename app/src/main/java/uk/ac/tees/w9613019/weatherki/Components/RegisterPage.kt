package uk.ac.tees.w9613019.weatherki.Components

import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
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
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class, ExperimentalComposeUiApi::class,
    ExperimentalComposeUiApi::class
)
@Composable
fun RegisterPage() {

    var firstName by remember { mutableStateOf("") }
    var lastName by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    val context = LocalContext.current
    val control=LocalSoftwareKeyboardController.current
    Column(modifier = Modifier.fillMaxSize().padding(10.dp)) {


        OutlinedTextField(value = firstName,
            onValueChange = { firstName=it },
            label = { Text(text = "FirstName") },
            singleLine = true,
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 10.dp)
            )
        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(value = lastName,
            onValueChange = { lastName=it },
            label = { Text(text = "LastName") },
            singleLine = true,
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 10.dp)
        )
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(value = email,
            onValueChange = { email=it },
            label = { Text(text = "Email") },
            singleLine = true,
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 10.dp)
        )
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(value = password,
            onValueChange = { password=it },
            label = { Text(text = "Password") },
            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Done),
            visualTransformation = PasswordVisualTransformation(),
            singleLine = true,
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 5.dp)
        )

        Spacer(modifier = Modifier.height(10.dp))
        Button(onClick = { Toast.makeText(context,"Registering",
            Toast.LENGTH_SHORT).show() },
            modifier = Modifier.fillMaxWidth().height(40.dp)) {
            control?.hide()
            Text(text = "Register")
            
        }

    }
}
@Preview
@Composable
fun RegisterPreview()
{
    RegisterPage()
}