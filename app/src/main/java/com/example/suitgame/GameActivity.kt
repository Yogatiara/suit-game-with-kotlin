package com.example.suitgame

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class GameActivity : AppCompatActivity() {

    private lateinit var computerImageView: ImageView
    private lateinit var rockImageButton: ImageButton
    private lateinit var scissorsImageButton: ImageButton
    private lateinit var paperImageButton: ImageButton
    private lateinit var resultImageView: ImageView

    private fun initComponents() {
        computerImageView = findViewById(R.id.computerImageView)
        rockImageButton = findViewById(R.id.rockImageButton)
        scissorsImageButton = findViewById(R.id.scissorsImageButton)
        paperImageButton = findViewById(R.id.paperImageButton)
        resultImageView = findViewById(R.id.resultImageView)
    }

    private fun initListeners() {
        rockImageButton.setOnClickListener {startGame("ROCK")}
        scissorsImageButton.setOnClickListener {startGame("SCISSORS")}
        paperImageButton.setOnClickListener {startGame("PAPER")}
    }

    private fun startGame(option: String) {
        val computerOption = GameEngine.pickRandomOption()
        computerImageView.setImageResource(GameEngine.pickDrawable(computerOption))

        when {
            GameEngine.isDraw(option, computerOption) -> resultImageView
                .setImageResource(R.drawable.draw)
            GameEngine.isWin(option, computerOption) -> resultImageView
                .setImageResource(R.drawable.win)
            else -> resultImageView.setImageResource(R.drawable.lose)

        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.game)

        initComponents()
        initListeners()
    }
}