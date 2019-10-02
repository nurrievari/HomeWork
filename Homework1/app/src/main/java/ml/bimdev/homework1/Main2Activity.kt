package ml.bimdev.homework1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class Main2Activity : AppCompatActivity() {

    val TAG = "MyApp"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val walle1 = Walle(20, true, null)
        Log.i(TAG, "crated WALL.E with $(walle1.backpackCapacity) backpack capacity")

        val eve1 = Eve("Earth", true, "Russian")
        Log.i(TAG, "crated EVE with $(eve1.language) language")

        val dag1 = Dag(0, "WALL.E", true)
        getInformationLog(dag1) {"DAG has found new alien pollutant $(it.alienPollutant)"}
    }

    inline fun <T> getInformationLog(obj : T, print: (T) -> String?) {
        Log.d(TAG, print(obj))
    }
}
