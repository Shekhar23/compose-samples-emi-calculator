package co.`in`.shekharpande.emicalculter

import BasicsCodelabTheme
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.text.TextStyle
import androidx.ui.tooling.preview.Preview

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BasicsCodelabTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Greeting("shekhar ")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Column {
        Card {
            Column {
                Text( text = "Hello $name!", style = TextStyle(color = Color.Yellow ) )
                Text(text = "Simple EMI calculator ... !")
            }
        }
        Card {
            Column {
                Text(text = "Hello $name!")
                Text(text = "Simple EMI calculator ... !")
            }
        }
        Card {
            Column {
                Text(text = "Hello $name!")
                Text(text = "Simple EMI calculator ... !")
            }
        }

    }
}

@Composable
fun displayEMIControls() {

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BasicsCodelabTheme {
        Greeting("Android")
    }
}