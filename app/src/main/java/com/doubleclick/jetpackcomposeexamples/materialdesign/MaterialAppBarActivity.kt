package com.doubleclick.jetpackcomposeexamples.materialdesign

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.doubleclick.jetpackcomposeexamples.ui.theme.JetPackComposeExamplesTheme

class MaterialAppBarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            JetPackComposeExamplesTheme {
                Column(modifier = Modifier.fillMaxSize()) {
                    SimpleTextComponent(text = "Bottom Appbar")
                    BottomAppBarComponent(this@MaterialAppBarActivity)
                    SimpleTextComponent(text = "Top Appbar")
                    TopAppBarComponent(this@MaterialAppBarActivity)
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
fun BottomAppBarComponent(context: Context) {
    BottomAppBar(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
    ) {
        IconButton(onClick = { Toast.makeText(context, "Menu", Toast.LENGTH_SHORT).show() }) {
            Icon(imageVector = Icons.Filled.Menu, contentDescription = "")
        }
        Spacer(Modifier.weight(1f, true))
        IconButton(onClick = { Toast.makeText(context, "Menu", Toast.LENGTH_SHORT).show() }) {
            Icon(imageVector = Icons.Filled.Favorite, contentDescription = "")
        }
        IconButton(onClick = { Toast.makeText(context, "Menu", Toast.LENGTH_SHORT).show() }) {
            Icon(imageVector = Icons.Filled.Person, contentDescription = "")
        }
    }
}


@Composable
fun TopAppBarComponent(context: Context) {
    TopAppBar(
        title = { Text(text = "") }, modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(),
        navigationIcon = {
            IconButton(onClick = {
                Toast.makeText(context, "clicked", Toast.LENGTH_SHORT).show()
            }) {
                Icon(imageVector = Icons.Filled.Menu, contentDescription = "")
            }
        }, actions = {
            IconButton(onClick = {
                Toast.makeText(context, "clicked", Toast.LENGTH_SHORT).show()
            }) {
                Icon(imageVector = Icons.Filled.Favorite, contentDescription = "")
            }
            IconButton(onClick = {
                Toast.makeText(context, "clicked", Toast.LENGTH_SHORT).show()
            }) {
                Icon(imageVector = Icons.Filled.Favorite, contentDescription = "")
            }
        }
    )
}