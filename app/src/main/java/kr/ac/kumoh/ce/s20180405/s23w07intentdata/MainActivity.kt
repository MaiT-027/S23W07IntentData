package kr.ac.kumoh.ce.s20180405.s23w07intentdata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kr.ac.kumoh.ce.s20180405.s23w07intentdata.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    companion object {
        const val KEY_NAME = "Grade"
    }
    private lateinit var main: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        main = ActivityMainBinding.inflate(layoutInflater)
        setContentView(main.root)

        main.btn1.setOnClickListener {
            Toast.makeText(this, "버튼1", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, ImageActivity::class.java)
            intent.putExtra(KEY_NAME, "Crimson")
            startActivity(intent)
        }
        main.btn2.setOnClickListener {
            Toast.makeText(this, "버튼2", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, ImageActivity::class.java)
            intent.putExtra(KEY_NAME, "Imperial")
            startActivity(intent)
        }
    }
}