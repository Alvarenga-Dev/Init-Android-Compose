package com.alvarengadev.initandroidcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }
}

@Composable
fun MainScreen() {
    Column(Modifier.fillMaxSize()) {
        Surface(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight(),
            color = Color.DarkGray
        ) {
            Text(
                text = "Toolbar Title",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(8.dp)
            )
        }
        Logo()
        FieldsComponent()

        Button(
            onClick = { },
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    horizontal = 32.dp,
                    vertical = 8.dp
                )
        ) {
            Text(text = "Login")
        }
    }
}

@Composable
fun Logo() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.Center
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_launcher_background),
            contentDescription = ""
        )
    }
}

@Composable
fun FieldsComponent() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.Start
    ) {
        SimpleFilledTextFieldSample("Login")
        SimpleFilledTextFieldSample("Password")
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SimpleFilledTextFieldSample(label: String) {
    var text by remember { mutableStateOf("Hello") }
    TextField(
        modifier = Modifier
            .fillMaxWidth()
            .padding(all = 8.dp),
        value = text,
        onValueChange = { text = it },
        label = { Text(label) }
    )
}

// Focus in preview
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MainScreen()
}
