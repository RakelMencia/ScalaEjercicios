import random._
import java.lang.System._
object EjerciciosP{
  def main(args: Array[String]): Unit = {
    /*setSeed((System.currentTimeMillis() / 1000).toInt)
    println(seedValue)
    println(nextInt())
    println(nextDouble())*/
    exNine()
  }

  //Ejercicio 9
  def exNine():Unit={
    val nombreUsuario = getProperty("user.name")
    val pass = Console.readLine("Write your password: ")
    if (!pass.equals("secret")) err.println("The password isn't secret")
    else println(s"Welcome $nombreUsuario!")
  }
}

//Ejercicio 3
package object random{
  var seedValue:Int=0

  def nextInt():Int={
    seedValue = (seedValue * 1664525 + 1013904223) % (2 ^ 32)
    seedValue
  }
  def nextDouble():Double={
    nextInt().toDouble
  }
  def setSeed(seed: Int):Unit={
    seedValue = seed
  }
}


