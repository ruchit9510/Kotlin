package com.example.rockpaperscissors

data class CoffeeDetails(
    val sugarCount: Int,
    val name: String,
    val size: String,
    val creamAmount: Int
)

fun main(){

    var coffeeForMe = CoffeeDetails(0,"ruchit", "xl" , 2 )
    var coffeeForJimmy = CoffeeDetails(8,"Jimmy","xxl",3)
    makeCoffee(coffeeForMe)
    makeCoffee(coffeeForJimmy)

}

fun askCoffee(){
    println("Who is this coffee for? ")
    val name = readln()
    println("How many pieces of sugar do you want! ")
    val sugarCount = readln()
    val sugarCountInt = sugarCount.toInt()
    //call function
   // makeCoffee(sugarCountInt , name)
}
fun makeCoffee(coffeeDetails: CoffeeDetails){
    if(coffeeDetails.sugarCount==0 ){
        println("Coffee with no sugar for ${coffeeDetails.name} + Add cream ${coffeeDetails.creamAmount} And Size is ${coffeeDetails.size}")
    }
    else if(coffeeDetails.sugarCount==1 ){
        println("Coffee with ${coffeeDetails.sugarCount} spoon sugar for ${coffeeDetails.name} + Add cream ${coffeeDetails.creamAmount} And Size is ${coffeeDetails.size}")
    }else  println("Coffee with ${coffeeDetails.sugarCount} spoons of sugar for ${coffeeDetails.name} + Add cream ${coffeeDetails.creamAmount} And Size is ${coffeeDetails.size}")

}