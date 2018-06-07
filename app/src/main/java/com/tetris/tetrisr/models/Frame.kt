package com.tetris.tetrisr.models

import com.tetris.tetrisr.helpers.array2dofByte

/**
 * Created by xyan1 on 5/17/18.
 */
class Frame(private val width: Int) {
    val data: ArrayList<ByteArray> = ArrayList()

    fun addRow(byteStr: String): Frame {
        val row = ByteArray(byteStr.length)

        for (index in byteStr.indices) {
            row[index] = "${byteStr[index]}".toByte()
        }
        data.add(row)
        return this
    }

    fun as2dByteArray(): Array<ByteArray> {
        val bytes = array2dofByte(data.size, width)
        return data.toArray(bytes)
    }
}