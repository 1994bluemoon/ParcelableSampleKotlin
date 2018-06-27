package minhhoang.d.parcelablesample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import minhhoang.d.parcelablesample.model.User

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        intent.let {
            val user = it.extras.get("user") as User
            Log.d("acti 2", user.toString())
        }

    }
}
