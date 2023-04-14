package com.doubleclick.jetpackcomposeexamples.layout

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.doubleclick.jetpackcomposeexamples.R
import com.doubleclick.jetpackcomposeexamples.ui.theme.JetPackComposeExamplesTheme

class BoxActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetPackComposeExamplesTheme {
                SimpleBoxComponent(this@BoxActivity)
            }
        }
    }
}


@Composable
fun SimpleBoxComponent(context: Context?) {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.p1),
            contentDescription = "",
            modifier = Modifier.clickable {
                Toast.makeText(context, "Clicked", Toast.LENGTH_SHORT).show()
            })
        Text(
            text = "Text",
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp, start = 16.dp),
            fontSize = 16.sp,
            textAlign = TextAlign.Center,
            color = Color.Red
        )

    }

}

@Preview
@Composable
fun prev() {
    SimpleBoxComponent(null)
}