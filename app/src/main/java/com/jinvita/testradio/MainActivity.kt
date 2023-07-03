package com.jinvita.testradio

import android.os.Bundle
import android.widget.RadioButton
import androidx.appcompat.app.AppCompatActivity
import com.jinvita.testradio.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            radioGroup.setOnCheckedChangeListener { group, checkedId ->
                textTitle.text = findViewById<RadioButton>(checkedId).text
            }

            btnSelect.setOnClickListener {
                when (radioGroup.checkedRadioButtonId) {
                    btnRadio1.id -> textResult.text = "첫번째 버튼 최종 선택"
                    btnRadio2.id -> textResult.text = "두번째 버튼 최종 선택"
                    btnRadio3.id -> textResult.text = "세번째 버튼 최종 선택"
                    btnRadio4.id -> textResult.text = "네번째 버튼 최종 선택"
                    else -> textResult.text = "라디오 버튼을 선택하세요."
                }
            }
        }
    }
}