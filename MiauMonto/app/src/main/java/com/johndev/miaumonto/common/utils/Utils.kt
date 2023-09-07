package com.johndev.miaumonto.common.utils

object Utils {

    fun getNameOfMont(numeroDeMes: Int): String? {
        val nombresDeMeses = arrayOf(
            "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
        )
        return if (numeroDeMes in 1..12) {
            nombresDeMeses[numeroDeMes - 1]
        } else {
            null
        }
    }

}