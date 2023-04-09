package com.doubleclick.jetpackcomposeexamples.card

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Divider
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.doubleclick.jetpackcomposeexamples.card.CardComponent.BorderedCardComponent
import com.doubleclick.jetpackcomposeexamples.card.CardComponent.ClickableCardComponent
import com.doubleclick.jetpackcomposeexamples.card.CardComponent.RoundedCornerCardComponent
import com.doubleclick.jetpackcomposeexamples.card.CardComponent.SimpleCardComponent

class CardExampleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Column(modifier = Modifier.fillMaxSize()) {
                SimpleCardComponent()
                Divider(color = Color.Gray)
                RoundedCornerCardComponent() {
                    Toast.makeText(this@CardExampleActivity, "Cilcked", Toast.LENGTH_SHORT).show()
                }
                Divider(color = Color.Gray)
                ClickableCardComponent()
                Divider(color = Color.Gray)
                BorderedCardComponent()
            }
        }

    }
}


