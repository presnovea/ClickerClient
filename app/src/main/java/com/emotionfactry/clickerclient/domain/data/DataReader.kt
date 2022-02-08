package com.emotionfactry.clickerclient.domain.data

import android.app.Application
import android.content.res.AssetManager
import com.emotionfactry.clickerclient.domain.model.Counter
import org.json.JSONArray
import org.json.JSONObject

class DataReader {

}

private fun readFromAsset(assets: AssetManager): MutableList<Counter> {

    val modeList = mutableListOf<Counter>()
    val bufferReader = assets.open("android_version.json").bufferedReader()
    val json_string = bufferReader.use {
        it.readText()
    }

    val jsonArray = JSONArray(json_string);

    for (i in 0..jsonArray.length() - 1) {
        val jsonObject: JSONObject = jsonArray.getJSONObject(i)
        val model = Counter(jsonObject.getString("title"), jsonObject.getLong("value"), jsonObject.getString("group") ,jsonObject.getBoolean("canDecrease"))
        modeList.add(model)
    }

    return modeList
}