package com.doubleclick.jetpackcomposeexamples.materialdesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.doubleclick.jetpackcomposeexamples.ui.theme.JetPackComposeExamplesTheme

class MaterialBottomNavigationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetPackComposeExamplesTheme {
                Column(modifier = Modifier.fillMaxSize()) {
                    SimpleTextComponent(text = "Bottom Navigation with Label(Always)")
                    BottomNavigationWithLabelComponent()
                    SimpleTextComponent(text = "Bottom Navigation without Label")
                    BottomNavigationWithoutLabelComponent()
                }
            }
        }
    }
}

@Composable
private fun SimpleTextComponent(text: String) {
    Text(
        text = text,
        style = TextStyle(
            fontSize = 16.sp
        ), modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
    )
}

@Composable
private fun BottomNavigationWithLabelComponent() {
    var selectedItem by remember {
        mutableStateOf(0)
    }
    val items = listOf("Home", "Bloge", "Profile")

    BottomNavigation(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(),
        backgroundColor = Color.Yellow,
        contentColor = Color.Black
    ) {
        items.forEachIndexed { index, item ->
            BottomNavigationItem(
                selected = selectedItem == index,
                onClick = { selectedItem = index },
                label = { Text(text = "${item}") },
                icon = {
                    Icon(imageVector = Icons.Filled.Email, contentDescription = "")
                }
            )
        }
    }
}

@Composable
fun BottomNavigationWithoutLabelComponent() {
    var selectedItem by remember { mutableStateOf(0) }
    val items = listOf("Home", "Blogs", "Profile")
    BottomNavigation(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(),
        backgroundColor = Color.Black,
        contentColor = Color.Yellow
    ) {
        items.forEachIndexed { index, item ->
            BottomNavigationItem(
                label = { Text(text = item) },
                icon = { Icon(imageVector = Icons.Filled.Favorite, contentDescription = "") },
                selected = selectedItem == index,
                onClick = { selectedItem = index },
                // alwaysShowLabels is used to set if you want to show the labels always or
                // just for the current item.
                alwaysShowLabel = false
            )
        }
    }
}

