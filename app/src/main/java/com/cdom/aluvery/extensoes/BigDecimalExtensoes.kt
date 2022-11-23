package com.cdom.aluvery.extensoes

import java.math.BigDecimal
import java.text.NumberFormat
import java.util.*

fun BigDecimal.converterPraReal(): String{
    return NumberFormat
        .getCurrencyInstance(
            Locale("pt", "br")
        )
        .format(this)
}