package com.gautam.domain.model

data class TempModel(
    val dt: Double? = 0.0,
    val min: Double? = 0.0,
    val max: Double? = 0.0,
    val night: Double? = 0.0,
    val eve: Double? = 0.0,
    val morn: Double? = 0.0,
)