package com.example.aboutmee

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.aboutmee.databinding.ActivityMainBinding
import com.example.aboutmee.model.Myname

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var myName: Myname = Myname(name = "Alexandre Silva")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.nickName.text = myName.name

        binding.button.setOnClickListener {
            addNickName(it)
        }
    }

    private fun addNickName(view: View) {
        binding.apply {
            nickName.text = nickNameEdit.text
            nickNameEdit.visibility = View.GONE
            view.visibility = View.GONE
            nickNameEdit.visibility = View.VISIBLE
        }
    }
}