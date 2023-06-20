package com.alvarengadev.initandroidcompose.layouts

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MultipleComposablesActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MultipleComposablesScreen()
        }
    }
}

@Composable
fun MultipleComposablesScreen() {
    Surface(
        color = Color.DarkGray,
        modifier = Modifier.fillMaxSize()
    ) {
        /*
        Column: A função "Column" cria uma coluna vertical,
        onde os elementos são dispostos verticalmente um abaixo do outro.
        É semelhante a uma pilha de componentes em uma direção vertical.
        Por exemplo, se você quiser exibir uma lista vertical de itens ou
        agrupar elementos verticalmente, você pode usar a função "Column".
        */

        Column {
            Text("Item 1")
            Text("Item 2")
            Text("Item 3")

//            Row:
//            A função "Row" cria uma linha horizontal,
//            onde os elementos são dispostos um ao lado do outro.
//            É útil quando você deseja alinhar componentes horizontalmente
//            ou criar uma barra de navegação ou uma série de botões,
//            por exemplo.

            Row {
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Vasco")
                }
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Vasco")
                }
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Vasco")
                }
            }

//            Box:
//            A função "Box" é usada para agrupar e organizar
//            elementos em uma área retangular.
//            Ela permite que você ajuste o posicionamento e o
//            tamanho dos componentes filhos usando as propriedades
//            "modifier" (modificador). A função "Box" é flexível e
//            pode ser usada para criar layouts personalizados.

            Box(
                Modifier
                    .size(200.dp)
                    .background(Color.Blue)
            ) {
                Text("Conteúdo dentro da Box", color = Color.White)
            }
        }
    }
}

// Focus in preview
@Preview(showBackground = true)
@Composable
fun MultipleComposablesDefaultPreview() {
    MultipleComposablesScreen()
}
