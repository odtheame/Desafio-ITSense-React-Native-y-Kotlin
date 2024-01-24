// SumaNumeros.kt
package com.anonymous.sumanumeros.kotlin

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.bridge.Promise

class SumaNumeros(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(reactContext) {

    companion object {
        const val NAME = "SumaNumeros"
    }

    override fun getName(): String {
        return NAME
    }

    @ReactMethod
    fun sumarPares(listadoPares: ArrayList<Int>, promise: Promise) {
        try {
            val suma = listadoPares.filter { it % 2 == 0 }.sum()
            promise.resolve(suma)
        } catch (e: Exception) {
            promise.reject("ERROR", e.message, e)
        }
    }
}
