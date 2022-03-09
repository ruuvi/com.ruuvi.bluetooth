package com.ruuvi.station.bluetooth

import java.util.*

data class LogReading (
    var date: Date = Date(),
    var id: String = "",
    var type: GattReadingType = GattReadingType.ALL,
    var humidity: Double? = null,
    var temperature: Double = 0.0,
    var pressure: Double? = null
)

enum class GattReadingType {
    TEMPERATURE, HUMIDITY, PRESSURE, ALL
}