package com.cdom.aluvery.ui.componentes

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.cdom.aluvery.R
import com.cdom.aluvery.modelo.Produto
import java.math.BigDecimal

@Composable
fun SecaoDeProdutos(
    titulo: String,
    produtos: List<Produto>
){
    Column {
        Text(
            text = "Promoções",
            Modifier.padding(start = 16.dp, end = 16.dp),
            fontSize = 20.sp,
            fontWeight = FontWeight(400)
        )
        Row(
            Modifier
                .padding(top = 8.dp,)
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState()),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Spacer(modifier = Modifier)
            for(p in produtos) {
                ItemProduto(produto = p)
            }
            Spacer(modifier = Modifier)
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun SecaoDeProdutosPreview(){
    SecaoDeProdutos("Promoções", sampleDeProdutos)

}

val sampleDeProdutos = listOf(
        Produto(
            "Hamburguer",
            BigDecimal("12,99"),
            R.drawable.burger
        ),
        Produto(
            "Batata Frita",
            BigDecimal("7.99"),
            R.drawable.fries
        ),
        Produto(
            "Pizza",
            BigDecimal("20.00"),
            R.drawable.pizza
        )
)