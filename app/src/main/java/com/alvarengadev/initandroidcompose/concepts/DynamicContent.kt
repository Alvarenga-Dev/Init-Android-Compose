package com.alvarengadev.initandroidcompose.concepts

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

val namesList: List<String> = listOf(
    "John",
    "Michael",
    "Andrew",
    "Anna",
    "Paul",
)

class DynamicContentActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GreetingList(names = namesList)
        }
    }
}

@Composable
fun GreetingList(names: List<String>) {
    Column {
        for (name in names) {
            GreetingText(name)
        }
    }
}

@Composable
fun GreetingText(name: String) {
    Text(text = name)
}

// Focus in preview
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    GreetingList(names = namesList)
}
