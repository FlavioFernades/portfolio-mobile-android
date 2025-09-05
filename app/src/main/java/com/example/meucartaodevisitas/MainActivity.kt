package com.example.meucartaodevisitas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
import com.example.meucartaodevisitas.ui.theme.MeuCartaoDeVisitasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MeuCartaoDeVisitasTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CartaoDeVisitas()
                }
            }
        }
    }
}

@Composable
fun CartaoDeVisitas() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Foto de perfil (adicione avatar.png em drawable)
        Image(
            painter = painterResource(id = R.drawable.avatar),
            contentDescription = "Foto de Perfil",
            modifier = Modifier
                .size(120.dp)
                .clip(CircleShape)
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Nome
        Text(
            text = "Jose Flavio Fernandes Pinheiro",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )

        // Título/Curso
        Text(
            text = "Tecnólogo em Sistemas para Internet",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(32.dp))

        // Contatos
        ContatoRow(icon = R.drawable.ic_phone, text = "(84) 99622-6668")
        ContatoRow(icon = R.drawable.ic_email, text = "flaviouern@gmail.com")
    }
}

@Composable
fun ContatoRow(icon: Int, text: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            painter = painterResource(id = icon),
            contentDescription = null,
            modifier = Modifier.size(20.dp)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(text = text)
    }
}

@Composable
@Preview(showBackground = true)
fun CartaoDeVisitasPreview() {
    MeuCartaoDeVisitasTheme {
        CartaoDeVisitas()
    }
}
