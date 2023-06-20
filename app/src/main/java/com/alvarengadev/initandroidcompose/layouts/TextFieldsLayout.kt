package com.alvarengadev.initandroidcompose.layouts

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

class TextFieldsLayout : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ContentScreen()
        }
    }
}

@Composable
fun ContentScreen() {
    val nameListSate = remember {
        mutableStateListOf("Messi", "Cristiano")
    }

    val newNameStateContent = remember {
        mutableStateOf("")
    }


    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        GreetingList(
            nameList = nameListSate,
            buttonClick = { nameListSate.add(newNameStateContent.value) },
            textFieldValue = newNameStateContent.value,
            textFieldUpdate = { newName ->  newNameStateContent.value = newName}
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GreetingList(
    nameList: List<String>,
    buttonClick: () -> Unit,
    textFieldValue: String,
    textFieldUpdate: (newName: String) -> Unit
) {
    for(name in nameList) {
        Greeting(name = name)
    }

    TextField(
        value = textFieldValue,
        onValueChange = textFieldUpdate
    )

    Button(onClick = buttonClick) {
        Text(text = "Add new name")
    }
}

@Composable
fun Greeting(
    name: String
) {
    Text(
        text = name,
        style = MaterialTheme.typography.displaySmall
    )
}

@Preview(showBackground = true)
@Composable
fun TextFieldsPreview() {
    ContentScreen()
}
