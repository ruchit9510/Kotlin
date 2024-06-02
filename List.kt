package com.example.rockpaperscissors

fun main(){
    val shoppingList = mutableListOf("Ruchit","Hitesh","Meet","Manan","Vivek")

    shoppingList.remove("Vivek")
    shoppingList.add("Axit")
    shoppingList.set(1,"Siddharth")

    shoppingList.add(2,"Hitesh")
    println(shoppingList)
    for (item in shoppingList){
        println(item)
        if (item == "Meet"){
            break
        }
    }
}