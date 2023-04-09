package com.doubleclick.jetpackcomposeexamples.card.CardComponent

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun Context.ClickableCardComponent() {
    Card(
        shape = RoundedCornerShape(16.dp),
        backgroundColor = Color.White,
        modifier = Modifier
            .padding()
            .fillMaxWidth()
            .clickable {
                Toast
                    .makeText(this, "Thanks for clicking!", Toast.LENGTH_SHORT)
                    .show()
            }
    ) {
        Text(
            text = "Clickable Card",
            textAlign = TextAlign.Center,
            style = TextStyle(
                fontSize = 16.sp
            ),
            modifier = Modifier.padding(16.dp)
        )
    }
}


@Preview
@Composable
private fun Context.pre() {
    ClickableCardComponent()
}