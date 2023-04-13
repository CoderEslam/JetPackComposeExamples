package com.doubleclick.jetpackcomposeexamples.clickable

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class ClickableExampleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier
                    .background(color = Color.White)
                    .fillMaxSize()
            ) {
                SimpleButtonComponent(this@ClickableExampleActivity)
                Divider(color = Color.Black, modifier = Modifier.padding(8.dp))
                SimpleTextComponent(this@ClickableExampleActivity)
                Divider(color = Color.Gray)
                SimpleCardComponent(this@ClickableExampleActivity)
            }
        }
    }
}

@Composable
private fun SimpleButtonComponent(context: Context) {

    Button(
        onClick = {
            Toast.makeText(context, "Done", Toast.LENGTH_SHORT).show()
        }, modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth()
    ) {
        Text(text = "Button")
    }

}

@OptIn(ExperimentalFoundationApi::class)
@Composable
private fun SimpleTextComponent(context: Context) {
    Text(
        text = "Text clicable",
        textAlign = TextAlign.Center,
        color = Color.Red,
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth()
            .combinedClickable(onClick = {
                Toast
                    .makeText(context, "Thanks for clicking! I am Text", Toast.LENGTH_SHORT)
                    .show()
            }, onLongClick = {
                Toast
                    .makeText(context, "Thanks for LONG click! I am Text", Toast.LENGTH_SHORT)
                    .show()
            }, onDoubleClick = {
                Toast
                    .makeText(context, "Thanks for DOUBLE click! I am Text", Toast.LENGTH_SHORT)
                    .show()
            })
    )
}

@Composable
private fun SimpleCardComponent(context: Context) {
    Card(
        shape = RoundedCornerShape(4.dp),
        backgroundColor = Color.Cyan,
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
            .clickable(onClick = {
                Toast
                    .makeText(context, "Thanks for clicking! I am Card.", Toast.LENGTH_SHORT)
                    .show()
            })
    ) {
        Text(
            text = "Card Text",
            modifier = Modifier.padding(16.dp),
            style = TextStyle(color = Color.Red, fontSize = 16.sp), textAlign = TextAlign.Center
        )
    }
}