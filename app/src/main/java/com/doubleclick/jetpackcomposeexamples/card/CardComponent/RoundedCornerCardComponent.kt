package com.doubleclick.jetpackcomposeexamples.card.CardComponent

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

typealias onclick = () -> Unit

@Composable
fun RoundedCornerCardComponent(onclick: () -> Unit) {
    Card(
        shape = RoundedCornerShape(50.dp),
        backgroundColor = Color(0xFFFFA867.toInt()),
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
            .clickable { onclick() }
    ) {
        Text(
            text = "Rounded Corner Card",
            textAlign = TextAlign.Center,
            style = TextStyle(fontSize = 16.sp),
            modifier = Modifier.padding(16.dp)
        )
    }
}

@Preview
@Composable
fun pre() {
    RoundedCornerCardComponent() {}
}