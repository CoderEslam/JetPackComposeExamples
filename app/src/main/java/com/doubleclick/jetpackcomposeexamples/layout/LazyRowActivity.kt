package com.doubleclick.jetpackcomposeexamples.layout

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.doubleclick.jetpackcomposeexamples.data.Blog
import com.doubleclick.jetpackcomposeexamples.data.getBlogList
import com.doubleclick.jetpackcomposeexamples.ui.theme.JetPackComposeExamplesTheme

class LazyRowActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetPackComposeExamplesTheme {
                LazyRowScrollableComponent(getBlogList(),this@LazyRowActivity)
            }
        }
    }
}

@Composable
fun LazyRowScrollableComponent(blogList: List<Blog>, context: Context) {
    LazyRow {
        items(items = blogList) { it ->
            Card(
                shape = RoundedCornerShape(8.dp),
                modifier = Modifier
                    .fillParentMaxWidth()
                    .padding(16.dp)
                    .clickable {
                        Toast
                            .makeText(context, "clicked", Toast.LENGTH_SHORT)
                            .show()
                    }, backgroundColor = Color.Green
            ) {
                Text(
                    text = it.name,
                    fontSize = 16.sp,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(16.dp)
                )
            }

        }
    }
}