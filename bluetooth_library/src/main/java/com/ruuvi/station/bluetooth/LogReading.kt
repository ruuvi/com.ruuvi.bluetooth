package com.ruuvi.station.bluetooth

import java.util.*

data class LogReading (
    var date: Date = Date(),
    var id: String = "",
    var type: GattReadingType = GattReadingType.ALL,
    var humidity: Double = 0.0,
    var temperature: Double = 0.0,
    var pressure: Double = 0.0,
)

enum class GattReadingType {
    TEMPERATURE, HUMIDITY, PRESSURE, ALL
}