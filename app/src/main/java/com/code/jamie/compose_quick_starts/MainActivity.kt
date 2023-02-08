package com.code.jamie.compose_quick_starts

import android.graphics.Paint.Align
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.code.jamie.compose_quick_starts.ui.theme.Compose_quick_startsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Compose_quick_startsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Box(
        modifier = Modifier
            .background(Color.Cyan)
            .size(400.dp),
    ) {
        Text(
            text = "Hello $name!",
            color = Color.Blue,
            fontSize = 30.sp,
            modifier = Modifier.align(Alignment.BottomEnd)
        )
        Text(
            text = "Some other text",
            color = Color.Blue,
            fontSize = 30.sp,
            modifier = Modifier.align(Alignment.TopStart)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Compose_quick_startsTheme {
        Greeting("Android")
    }
}