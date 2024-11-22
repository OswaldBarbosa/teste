package com.example.composewithjava


import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.ComposeView

fun setComposeContent(view: ComposeView) {
    view.setContent {
        MyComposable()
    }
}

@Composable
fun MyComposable() {
    Text(text = "Olá, Compose com Java!")
}