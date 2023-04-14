package com.doubleclick.jetpackcomposeexamples.button

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.contextaware.ContextAware
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush.Companion.sweepGradient
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.doubleclick.jetpackcomposeexamples.R


class MaterialButtonActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier
                    .background(color = Color.White)
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState())
            ) {
                SimpleTextComponent("Example of Simple Buttons")
                SimpleButtonComponent(this@MaterialButtonActivity)
                Divider(color = Color.Gray)
                RoundedCornerButtonComponent(this@MaterialButtonActivity)
                Divider(color = Color.Gray)
                BorderButtonComponent(this@MaterialButtonActivity)
                Divider(color = Color.Gray)
                ButtonWithIconComponent(this@MaterialButtonActivity)
                Divider(color = Color.Gray)
                DisabledButtonComponent(this@MaterialButtonActivity)
                Divider(color = Color.Gray)
                OutlinedButtonComponent(this@MaterialButtonActivity)
                Divider(color = Color.Gray)
                IconButtonComponent(this@MaterialButtonActivity)
                Divider(color = Color.Gray)
                FloatingActionButtonComponent(this@MaterialButtonActivity)
            }
        }
    }
}

@Composable
private fun SimpleTextComponent(text: String) {
    Text(
        text = text,
        style = TextStyle(
            fontSize = 16.sp,
            color = Color.Black
        ),
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth()
            .background(color = Color.White, shape = RoundedCornerShape(8.dp))
            .padding(16.dp)

    )
}

@Composable
fun SimpleButtonComponent(context: Context) {

    Button(
        onClick = {
            Toast.makeText(context, "Clicked", Toast.LENGTH_SHORT).show()

        }, modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth()
    ) {
        Text(text = "Click me")
    }

}


@Composable
fun RoundedCornerButtonComponent(context: Context) {
    Button(
        onClick = {
            Toast.makeText(context, "Clicked", Toast.LENGTH_SHORT).show()
        }, modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth(),
        shape = RoundedCornerShape(4.dp)
    ) {
        Text(text = "Click")
    }
}

@Composable
fun BorderButtonComponent(context: Context) {
    Button(
        onClick = {
            Toast.makeText(context, "Clicked", Toast.LENGTH_SHORT).show()
        }, modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth(),
        border = BorderStroke(width = 1.dp, brush = SolidColor(Color.Green))
    ) {
        Text("Click")
    }
}


@Composable
fun ButtonWithIconComponent(context: Context) {
    Button(
        onClick = {
            Toast.makeText(context, "Clicked", Toast.LENGTH_SHORT).show()
        }, modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        border = BorderStroke(
            1.dp,
            brush = sweepGradient(listOf(Color.Green, Color.Blue, Color.Red))
        )
    ) {
        Text(text = "Click")
        Icon(
            imageVector = Icons.Filled.Favorite,
            contentDescription = "",
            tint = Color.Red,
            modifier = Modifier.padding(horizontal = 8.dp)
        )
    }
}

@Composable
fun DisabledButtonComponent(context: Context) {
    Button(
        onClick = {
            Toast.makeText(context, "Clicked", Toast.LENGTH_SHORT).show()
        }, modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth(),
        enabled = false
    ) {
        Text(text = "Disabled Button Component")
        Icon(
            imageVector = Icons.Filled.Add,
            contentDescription = "",
            modifier = Modifier.padding(horizontal = 8.dp)
        )
    }
}

@Composable
fun OutlinedButtonComponent(context: Context) {
    OutlinedButton(
        onClick = {
            Toast.makeText(context, "Outlined Button Component!", Toast.LENGTH_LONG).show()
        },
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth(),
    ) {
        Text("Click")
        Icon(imageVector = Icons.Filled.Add, contentDescription = "")
    }
}

@Composable
fun IconButtonComponent(context: Context) {
    IconButton(
        onClick = {
            Toast.makeText(context, "Clicked", Toast.LENGTH_SHORT).show()
        }, modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth()
    ) {
        Icon(imageVector = Icons.Filled.Add, contentDescription = "")
    }
}

@Composable
fun FloatingActionButtonComponent(context: Context) {

    FloatingActionButton(onClick = {
        Toast.makeText(context, "FloatingActionButtonComponent", Toast.LENGTH_SHORT).show()
    }, modifier = Modifier
        .padding(8.dp)) {
        Icon(imageVector = Icons.Filled.Add, contentDescription = "")
    }

}


@Preview
@Composable
private fun Pre() {
    SimpleTextComponent("text")
}
