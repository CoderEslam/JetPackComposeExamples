package com.doubleclick.jetpackcomposeexamples.layout

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.doubleclick.jetpackcomposeexamples.data.Blog
import com.doubleclick.jetpackcomposeexamples.data.getBlogList
import com.doubleclick.jetpackcomposeexamples.ui.theme.JetPackComposeExamplesTheme

class ScrollableColumnComponent : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetPackComposeExamplesTheme {
                ScrollableColumnComponent(getBlogList(), this@ScrollableColumnComponent)
            }
        }

    }
}


@Composable
fun ScrollableColumnComponent(blogList: List<Blog>, context: Context) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        for (blog in blogList) {
            Card(
                shape = RoundedCornerShape(8.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
                    .clickable {
                        Toast
                            .makeText(context, "${blog.name}", Toast.LENGTH_SHORT)
                            .show()
                    },
                backgroundColor = Color.Yellow
            ) {
                Text(
                    text = "${blog.name}",
                    style = TextStyle(fontSize = 16.sp, textAlign = TextAlign.Center),
                    modifier = Modifier.padding(16.dp)
                )
            }
        }
    }
}