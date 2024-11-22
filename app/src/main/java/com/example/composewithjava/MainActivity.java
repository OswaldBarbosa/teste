package com.example.composewithjava;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.compose.ui.platform.ComposeView;

public class MainActivity extends ComponentActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Criar um ComposeView
        ComposeView composeView = new ComposeView(this);

        // Configurar o conteúdo do ComposeView usando a função auxiliar
        MyComposableKt.setComposeContent(composeView);

        // Definir o ComposeView como conteúdo principal
        setContentView(composeView);
    }
}
