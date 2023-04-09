package com.doubleclick.jetpackcomposeexamples

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.gestures.ScrollableState
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.doubleclick.jetpackcomposeexamples.button.MaterialButtonActivity
import com.doubleclick.jetpackcomposeexamples.card.CardExampleActivity
import com.doubleclick.jetpackcomposeexamples.ui.theme.JetPackComposeExamplesTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetPackComposeExamplesTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .verticalScroll(rememberScrollState())
                    ) {
                        ButtonComponent(
                            this@MainActivity,
                            Intent(this@MainActivity, MaterialButtonActivity::class.java),
                            "click button"
                        )
                        ButtonComponent(
                            this@MainActivity,
                            Intent(this@MainActivity, CardExampleActivity::class.java),
                            "Card"
                        )
                        ButtonComponent(
                            this@MainActivity,
                            Intent(this@MainActivity, MaterialButtonActivity::class.java),
                            "click button"
                        )
                        ButtonComponent(
                            this@MainActivity,
                            Intent(this@MainActivity, MaterialButtonActivity::class.java),
                            "click button"
                        )
                        ButtonComponent(
                            this@MainActivity,
                            Intent(this@MainActivity, MaterialButtonActivity::class.java),
                            "click button"
                        )
                        ButtonComponent(
                            this@MainActivity,
                            Intent(this@MainActivity, MaterialButtonActivity::class.java),
                            "click button"
                        )
                        ButtonComponent(
                            this@MainActivity,
                            Intent(this@MainActivity, MaterialButtonActivity::class.java),
                            "click button"
                        )
                        ButtonComponent(
                            this@MainActivity,
                            Intent(this@MainActivity, MaterialButtonActivity::class.java),
                            "click button"
                        )
                        ButtonComponent(
                            this@MainActivity,
                            Intent(this@MainActivity, MaterialButtonActivity::class.java),
                            "click button"
                        )
                        ButtonComponent(
                            this@MainActivity,
                            Intent(this@MainActivity, MaterialButtonActivity::class.java),
                            "click button"
                        )
                        ButtonComponent(
                            this@MainActivity,
                            Intent(this@MainActivity, MaterialButtonActivity::class.java),
                            "click button"
                        )
                        ButtonComponent(
                            this@MainActivity,
                            Intent(this@MainActivity, MaterialButtonActivity::class.java),
                            "click button"
                        )
                        ButtonComponent(
                            this@MainActivity,
                            Intent(this@MainActivity, MaterialButtonActivity::class.java),
                            "click button"
                        )
                        ButtonComponent(
                            this@MainActivity,
                            Intent(this@MainActivity, MaterialButtonActivity::class.java),
                            "click button"
                        )
                        ButtonComponent(
                            this@MainActivity,
                            Intent(this@MainActivity, MaterialButtonActivity::class.java),
                            "click button"
                        )
                        ButtonComponent(
                            this@MainActivity,
                            Intent(this@MainActivity, MaterialButtonActivity::class.java),
                            "click button"
                        )
                        ButtonComponent(
                            this@MainActivity,
                            Intent(this@MainActivity, MaterialButtonActivity::class.java),
                            "click button"
                        )
                        ButtonComponent(
                            this@MainActivity,
                            Intent(this@MainActivity, MaterialButtonActivity::class.java),
                            "click button"
                        )
                        ButtonComponent(
                            this@MainActivity,
                            Intent(this@MainActivity, MaterialButtonActivity::class.java),
                            "click button"
                        )

                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetPackComposeExamplesTheme {
//        Greeting("Android")
        ButtonComponent(null, null, "click button")
    }
}

