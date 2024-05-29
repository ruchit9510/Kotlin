package com.example.rockpaperscissors

fun main() {
    var computerChoice: String
    var playerChoice: String
    var name: String
    var playerScore = 0
    var computerScore = 0
    val choices = listOf("Rock", "Paper", "Scissors")

    print("Enter your name: ")
    name = readln().trim()

    while (true) {
        while (true) {
            print("Rock, Paper, Scissors? Enter your choice: ")
            playerChoice = readln().trim().capitalize()
            if (playerChoice in choices) break
            println("Invalid choice. Please enter Rock, Paper, or Scissors.")
        }

        computerChoice = choices.random()

        println("Computer's choice is $computerChoice")

        val winner = when {
            playerChoice == computerChoice -> "Tie"
            playerChoice == "Rock" && computerChoice == "Scissors" -> name
            playerChoice == "Paper" && computerChoice == "Rock" -> name
            playerChoice == "Scissors" && computerChoice == "Paper" -> name
            else -> "Computer"
        }

        when (winner) {
            "Tie" -> {
                println("It's a tie!!")
            }
            name -> {
                println("$name won!!")
                playerScore++
            }
            else -> {
                println("Computer won!!")
                computerScore++
            }
        }

        println("Score: $name $playerScore - Computer $computerScore")

        print("Do you want to play again? (yes/no): ")
        val playAgain = readln().trim().lowercase()
        if (playAgain != "yes") {
            println("Thanks for playing! Final score: $name $playerScore - Computer $computerScore")
            break
        }
    }
}
