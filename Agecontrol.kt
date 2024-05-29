package com.example.kotlinpractice

fun main() {
    var age = 0
    print("Enter your age: ")
    val value = readln()
    age = value.toInt()

    if (age < 18) {
        print("You are too young to go to the club")
    } else if (age in 18..39) {
        print("You can go to the club!!")
    } else {
        print("You are too old!!!")
    }
}
