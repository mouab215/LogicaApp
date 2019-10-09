package com.mourad.logicaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val solution = arrayOf("T", "F", "F", "F")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        submitBtn.setOnClickListener { checkAnswers() }
    }

    private fun checkAnswers() {
        var answers = arrayOf(answerOne.text.toString(),
            answerTwo.text.toString(),
            answerThree.text.toString(),
            answerFour.text.toString())

        if (solution[0] == answers[0] && solution[1] == answers[1] && solution[2] == answers[2] && solution[3] == answers[3]) {
            Toast.makeText(this, getString(R.string.correct), Toast.LENGTH_LONG).show()
        } else {
            Toast.makeText(this, getString(R.string.incorrect), Toast.LENGTH_LONG).show()
        }

    }
}
