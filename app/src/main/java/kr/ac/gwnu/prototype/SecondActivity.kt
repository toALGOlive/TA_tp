package kr.ac.gwnu.prototype

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.ac.gwnu.prototype.databinding.ActivityMainBinding
import kr.ac.gwnu.prototype.databinding.ActivitysecondBinding

class SecondActivity : AppCompatActivity() {
   private val binding by lazy{ActivitysecondBinding.inflate(layoutInflater)}


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        //엑티비티 연결 -> 메인 엑티비티
       binding.ReturnBtn.setOnClickListener() {
            finish()
        }
    }

    }