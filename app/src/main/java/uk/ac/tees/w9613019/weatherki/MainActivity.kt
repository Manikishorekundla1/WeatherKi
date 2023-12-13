package uk.ac.tees.w9613019.weatherki

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationCallback
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.HttpException
import uk.ac.tees.w9613019.weatherki.Components.RegisterPage
import uk.ac.tees.w9613019.weatherki.data.Weatherdata
import uk.ac.tees.w9613019.weatherki.ui.theme.WeatherKiTheme
import uk.ac.tees.w9613019.weatherki.utils.RetrofitInstance
import java.io.IOException

class MainActivity : ComponentActivity() {
    private lateinit var fusedLocationProviderClient: FusedLocationProviderClient
    private lateinit var locationCallback: LocationCallback
    private var locationrequired:Boolean=false
    private var fact= mutableStateOf(Weatherdata())

    @SuppressLint("CoroutineCreationDuringComposition")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WeatherKiTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val fact by remember {
                        mutableStateOf(Weatherdata())
                    }
                    val scope = rememberCoroutineScope()
                    LaunchedEffect(key1 =true){


                        scope.launch (Dispatchers.IO){

                            val response = try{
                                RetrofitInstance.ap.getdata()
                            }catch (e:HttpException){
                                Toast.makeText(this@MainActivity,"http error : ${e.message}",Toast.LENGTH_SHORT).show()
                                return@launch
                            }catch (e:IOException)
                            {
                                Toast.makeText(this@MainActivity,"IO error : ${e.message}",Toast.LENGTH_SHORT).show()
                                return@launch

                            }
                            if(response.isSuccessful && response.body()!=null){
                                withContext(Dispatchers.Main){

                                }
                            }

                        }
                    }
                    }


                    uk.ac.tees.w9613019.weatherki.display()


                }
            }
        }
    }
}
@Composable
fun display(data:Weatherdata)
{

}