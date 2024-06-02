package com.example.rockpaperscissors

fun main() {
    var computerChoice: String
    var playerChoice: String
    var name: String

    print("Enter your name: ")
    name = readln().trim()

    while (true) {
        print("Rock, Paper, or Scissors? Enter your choice (or type 'exit' to quit): ")
        playerChoice = readln().trim()

        if (playerChoice == "exit") {
            println("Goodbye!")
            break
        }

        if (playerChoice !in listOf("Rock", "Paper", "Scissors")) {
            println("Invalid choice. Please enter Rock, Paper, or Scissors.")
            continue
        }

        val randomNumber = (1..3).random()
        computerChoice = when (randomNumber) {
            1 -> "Rock"
            2 -> "Paper"
            3 -> "Scissors"
            else -> throw IllegalStateException("Unexpected value: $randomNumber")
        }

        println("Computer's choice is $computerChoice")

        val winner = when {
            playerChoice == computerChoice -> "Tie"
            playerChoice == "Rock" && computerChoice == "Scissors" -> name
            playerChoice == "Paper" && computerChoice == "Rock" -> name
            playerChoice == "Scissors" && computerChoice == "Paper" -> name
            else -> "Computer"
        }

        when (winner) {
            "Tie" -> println("It's a tie!!")
            name -> println("$name won!!")
            else -> println("Computer won!!")
        }
    }
}
