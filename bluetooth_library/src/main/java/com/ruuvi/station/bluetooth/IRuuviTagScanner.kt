package com.ruuvi.station.bluetooth

import java.util.*

interface IRuuviTagScanner {

    fun startScanning(foundListener: OnTagFoundListener)

    fun stopScanning()

    fun canScan(): Boolean

    fun connect(macAddress: String, readLogsFrom: Date?, listener: IRuuviGattListener): Boolean

    interface OnTagFoundListener {

        fun onTagFound(tag: FoundRuuviTag)
    }
}