package com.alvarengadev.initandroidcompose.layouts

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

// arquivo focado no uso do ROW e seus parâmetros.

class RowUseActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RowUseScreen()
        }
    }
}

@Composable
fun RowUseScreen() {
    Surface(
        color = Color.DarkGray,
        modifier = Modifier.fillMaxSize()
    ) {
        Row(
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.SpaceBetween, //lógica é a mesma do RN
            verticalAlignment = Alignment.CenterVertically
        ) {
            HorizontalColoredBar(color = Color.Black)
            HorizontalColoredBar(color = Color.Blue)
            HorizontalColoredBar(color = Color.Magenta)
            HorizontalColoredBar(color = Color.Red)
            HorizontalColoredBar(color = Color.Yellow)
        }
    }
}

// Você pode criar um "Composable" e reutilizar ele
// em diversas partes do Layout

@Composable
fun HorizontalColoredBar(color: Color) {
    Surface(
        color = color,
        modifier = Modifier
            .height(600.dp)
            .width(60.dp)
    ) { }
}

// Focus in preview
@Preview(showBackground = true)
@Composable
fun RowUseDefaultPreview() {
    RowUseScreen()
}
