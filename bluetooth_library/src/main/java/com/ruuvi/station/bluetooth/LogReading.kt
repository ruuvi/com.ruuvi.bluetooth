package com.ruuvi.station.bluetooth

import java.util.*

enum class GattReadingType {
    TEMPERATURE, HUMIDITY, PRESSURE, ALL
}

class LogReading {
    var date = Date()
    var id: String = ""
    var type: GattReadingType = GattReadingType.ALL
    var humidity = 0.0
    var temperature = 0.0
    var pressure = 0.0
}
