package com.cdom.aluvery.modelo

import androidx.annotation.DrawableRes
import java.math.BigDecimal

class Produto(
    val nome: String,
    val preco: BigDecimal,
    @DrawableRes
    val imagem: Int
) {

}
