package com.tetris.tetris.storage

import android.content.Context
import android.content.SharedPreferences

/**
 * Created by xyan1 on 5/14/18.
 */
class AppPreferences(ctx: Context) {
    var data:SharedPreferences = ctx.getSharedPreferences("APP_PREFERENCES",Context.MODE_PRIVATE)

    fun saveHighScore(highScore:Int){
        data.edit().putInt("HIGH_SCORE",highScore).apply()
    }

    fun getHighScore():Int{
        return data.getInt("HIGH_SCORE",0)
    }

    fun clearHighScore(){
        data.edit().putInt("HIGH_SCORE",0).apply()
    }
}