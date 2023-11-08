package com.example.rockpaperscissors

fun main(){
   var choice : Char = 'y'
    while (choice == 'y'){
        var computerChoiceNumber = (1..3).random()
        var playerchoice = ""
        var computerChoice = ""
        when (computerChoiceNumber) {
            1 -> {
                computerChoice = "rock"
            }
            2 -> {
                computerChoice = "paper"
            }
            3 -> {
                computerChoice = "scissors"
            }
            else -> {
                println("Error")
            }
        }
        println("Welcome to Rock, Paper, Scissors! Please enter your choice by typing the one of the three words: ")
        playerchoice = readLine()!!.lowercase()
        while (playerchoice != "rock" && playerchoice != "paper" && playerchoice != "scissors"){
            println("please enter a valid choice:")
            playerchoice = readLine()!!
        }

        println("The computer chose $computerChoice")
//    if(playerchoice == "Rock"){
//        when (computerChoice) {
//            "Rock" -> {
//                println("It's a tie!")
//            }
//            "Paper" -> {
//                println("You lose!")
//            }
//            "Scissors" -> {
//                println("You win!")
//            }
//            else -> {
//                println("Error")
//
//            }
//        }
//    } else if (playerchoice == "Paper"){
//        when (computerChoice) {
//            "Rock" -> {
//                println("You win!")
//            }
//            "Paper" -> {
//                println("It's a tie!")
//            }
//            "Scissors" -> {
//                println("You lose!")
//            }
//            else -> {
//                println("Error")
//            }
//        }
//    } else if (playerchoice == "Scissors"){
//        when (computerChoice) {
//            "Rock" -> {
//                println("You lose!")
//            }
//            "Paper" -> {
//                println("You win!")
//            }
//            "Scissors" -> {
//                println("It's a tie!")
//            }
//            else -> {
//                println("Error")
//            }
//        }
//    } else {
//        println("Error")
//    }
// a when statment is like switch in java
        val winner = when {
            computerChoice == playerchoice -> "It's a tie!"
            playerchoice == "rock" && computerChoice == "Scissors" -> "You win!"
            playerchoice == "paper" && computerChoice == "Rock" -> "You win!"
            playerchoice == "scissors" && computerChoice == "Paper" -> "You win!"
            else -> "You lose!"//we only considered the senarios where the player wins, so if the player doesn't win, the computer wins
            //this saves the hustle done above
        }
        if (winner == "It's a tie!"){
            println(winner)
        } else if (winner == "You win!"){
            println(winner)
        } else if (winner == "You lose!"){
            println(winner)
        } else {
            println("Error")
        }
        println("if you want to play again type y, if not type n")
        choice = readln().toString().single().lowercaseChar()
        if (choice == 'n'){
            println("Thanks for playing!")
        }
    }
}
