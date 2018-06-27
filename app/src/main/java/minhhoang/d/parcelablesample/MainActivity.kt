package minhhoang.d.parcelablesample

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import minhhoang.d.parcelablesample.model.PerInfor
import minhhoang.d.parcelablesample.model.User

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val user = User("userId",  "pass", PerInfor("name", "surname"))

        startActivity(Intent(this@MainActivity, Main2Activity::class.java).putExtra("user", user))
    }
}
