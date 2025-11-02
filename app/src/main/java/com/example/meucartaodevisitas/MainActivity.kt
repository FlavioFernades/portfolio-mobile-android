package com.example.meucartaodevisitas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.meucartaodevisitas.navigation.AppNavigation
import com.example.meucartaodevisitas.ui.theme.MeuCartaoDeVisitasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MeuCartaoDeVisitasTheme {
                AppNavigation()
            }
        }
    }
}
