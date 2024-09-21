package com.example.suitgame

import org.junit.Assert
import org.junit.Test

class GameTest {
    @Test
    fun testPickRandomOption() {
        val options = listOf("ROCK", "SCISSORS", "PAPER")
        Assert.assertTrue(options.contains(GameEngine.pickRandomOption()))
        Assert.assertTrue(options.contains(GameEngine.pickRandomOption()))
        Assert.assertTrue(options.contains(GameEngine.pickRandomOption()))
        Assert.assertTrue(options.contains(GameEngine.pickRandomOption()))
        Assert.assertTrue(options.contains(GameEngine.pickRandomOption()))
        Assert.assertTrue(options.contains(GameEngine.pickRandomOption()))
        Assert.assertTrue(options.contains(GameEngine.pickRandomOption()))

    }

    @Test
    fun testPickDrawable() {
        Assert.assertEquals(R.drawable.paper, GameEngine.pickDrawable("PAPER"))
        Assert.assertEquals(R.drawable.rock, GameEngine.pickDrawable("ROCK"))
        Assert.assertEquals(R.drawable.scissors, GameEngine.pickDrawable("SCISSORS"))
    }

    @Test
    fun isDraw() {
        Assert.assertTrue(GameEngine.isDraw("ROCK", "ROCK"))
        Assert.assertTrue(GameEngine.isDraw("PAPER", "PAPER"))
        Assert.assertTrue(GameEngine.isDraw("SCISSORS", "SCISSORS"))

        Assert.assertFalse(GameEngine.isDraw("ROCK", "PAPER"))
        Assert.assertFalse(GameEngine.isDraw("PAPER", "SCISSORS"))
        Assert.assertFalse(GameEngine.isDraw("SCISSORS", "ROCK"))
    }


    @Test
    fun testIsWin() {
        Assert.assertTrue(GameEngine.isWin("ROCK", "SCISSORS"))
        Assert.assertTrue(GameEngine.isWin("PAPER", "ROCK"))
        Assert.assertTrue(GameEngine.isWin("SCISSORS", "PAPER"))

        Assert.assertFalse(GameEngine.isWin("ROCK", "PAPER"))
        Assert.assertFalse(GameEngine.isWin("PAPER", "SCISSORS"))
        Assert.assertFalse(GameEngine.isWin("SCISSORS", "ROCK"))
    }
}