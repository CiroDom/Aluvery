package com.cdom.aluvery.ui.componentes

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.cdom.aluvery.R
import com.cdom.aluvery.modelo.Produto
import java.math.BigDecimal

@Composable
fun TelaInicial(){
    Column(
        Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Spacer(Modifier)
        SecaoDeProdutos("Promoções", sampleDeProdutos)
        SecaoDeProdutos(
            "Doces", listOf(
                Produto(
                    "Chocolate",
                    BigDecimal("5.99"),
                    R.drawable.placeholder
                )
            )
        )
        SecaoDeProdutos("Bebidas", sampleDeProdutos)
        Spacer(Modifier)
    }
}

@Preview(showSystemUi = true)
@Composable
fun TelaInicialPreview() {
    TelaInicial()
}
