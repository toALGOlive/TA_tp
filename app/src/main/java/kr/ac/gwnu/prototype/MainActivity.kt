package kr.ac.gwnu.prototype

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.ac.gwnu.prototype.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

   private  val binding by lazy{ActivityMainBinding.inflate(layoutInflater)}


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        val intent = Intent(this, SecondActivity::class.java)
        //엑티비티 연결-> 세컨드 엑티비티
        binding.TotaleditBtn.setOnClickListener{
            startActivity(intent)
        }

        binding.listBtn.setOnClickListener{
            ListPurchaseFragment().show(supportFragmentManager, null)

        }

        binding.eixtBtn.setOnClickListener{
            finish() //엑티비티 종료
            //System.exit(0)//시스템 완전 종료

        }

 }
}