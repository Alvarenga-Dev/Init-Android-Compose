package com.alvarengadev.initandroidcompose.layouts

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

// arquivo focado no uso do COLUMN e seus parâmetros.

class ColumnUseActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ColumnUseScreen()
        }
    }
}

@Composable
fun ColumnUseScreen() {
    Surface(
        color = Color.DarkGray,
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.SpaceEvenly, //lógica é a mesma do RN
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                VerticalColoredBar(color = Color.Black)
                VerticalColoredBar(color = Color.Blue)
            }
            VerticalColoredBar(color = Color.Magenta)
            VerticalColoredBar(color = Color.Red)
            VerticalColoredBar(color = Color.Yellow)
        }
    }
}

// Você pode criar um "Composable" e reutilizar ele
// em diversas partes do Layout

@Composable
fun VerticalColoredBar(color: Color) {
    Surface(
        color = color,
        modifier = Modifier
            .height(100.dp)
            .width(100.dp)
    ) { }
}

// Focus in preview
@Preview(showBackground = true)
@Composable
fun ColumnUseDefaultPreview() {
    ColumnUseScreen()
}
