package com.nishajain.gradientbuttonjetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.nishajain.gradientbuttonjetpack.ui.theme.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // Row is used for align the buttons in center of screen
            Row(
                modifier = Modifier.fillMaxSize(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                // this is the first button
                GradientButton(
                    text = "Button1", textColor = Color.Black, gradient = Brush.horizontalGradient(
                        colors = listOf(
                            c1,
                            c2,
                            c1
                        )
                    )
                ) {}

                // Spacer is used to give the space between two buttons
                Spacer(modifier = Modifier.width(10.dp))

                // This is second button
                GradientButton(
                    text = "Button2", textColor = Color.Black, gradient = Brush.horizontalGradient(
                        colors = listOf(
                            c3,
                            c4,
                            c3
                        )
                    )
                ) {}

            }
        }
    }

}