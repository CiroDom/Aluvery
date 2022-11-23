package com.cdom.aluvery.ui.componentes

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.cdom.aluvery.R
import com.cdom.aluvery.extensoes.converterPraReal
import com.cdom.aluvery.modelo.Produto
import com.cdom.aluvery.ui.theme.Purple500
import com.cdom.aluvery.ui.theme.Teal200
import java.math.BigDecimal

@Composable
fun ItemProduto(produto: Produto){
    Surface(
        shape = RoundedCornerShape(15.dp),
        elevation = 4.dp
    ){
        Column(
            Modifier
                .heightIn(250.dp, 300.dp)
                .width(200.dp)
        ){
            val tamanhoImagem: Dp = 100.dp

            Box(
                modifier = Modifier
                    .height(tamanhoImagem)
                    .fillMaxWidth()
                    .background(
                        brush = Brush.horizontalGradient(
                            colors = listOf(
                                Purple500,
                                Teal200,
                            )
                        )
                    )
            ){
                Image(
                    painter = painterResource(id = produto.imagem),
                    contentDescription = null,
                    Modifier
                        .size(tamanhoImagem)
                        .offset(y = tamanhoImagem / 2)
                        .clip(shape = CircleShape)
                        .align(Alignment.BottomCenter),
                    contentScale = ContentScale.Crop
                )
            }

            Spacer(
                modifier = Modifier
                    .height(tamanhoImagem/2)
            )

            Column(Modifier.padding(16.dp),) {
                Text(
                    text = produto.nome,
                    fontSize = 18.sp,
                    fontWeight = FontWeight(700),
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis
                )
                Text(
                    text = produto.preco.converterPraReal(),
                    fontSize = 14.sp,
                    fontWeight = FontWeight(400)
                )
            }
        }

    }
}

@Preview(showBackground = true)
@Composable
private fun ItemProdutoPreview(){
    ItemProduto(
        Produto(
            nome = LoremIpsum(50).values.first(),
            preco = BigDecimal("14.99"),
            imagem = R.drawable.placeholder
        )
    )
}