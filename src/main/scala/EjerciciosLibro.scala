object Ejercicios{
  def main(args: Array[String]): Unit = {
    //exOne(3)
    //exFour()
    //exFive(6)
    //exSix()
    //exSeven("Hello")
    //exEight("Hello")
    //println(exNine("Hello"))
    exTen(2, 8)
  }

  //CHAPTER 2.
  //Ejercicio 1.
  def exOne(number: Int):String={
    if (number>0){
      "positive"
    } else if (number<0){
      "negative"
    } else {
      "zero"
    }
  }

  //Ejercicio 4
  def exFour():Unit={
    for (i <- 10 to 0 by -1)
      println(i)
  }

  //Ejercicio 5
  def exFive(n: Int): Unit = {
    for (i <- n to 0 by -1)
      println(i)
  }

  //Ejercicio 6
  def exSix(): Unit={
    val cadena = "Hello"
    var total = 1
    for (i <- 0 until cadena.length) {
      total = total * cadena(i)
    }
    println(total)
  }

  //Ejercicio 7
  def exSeven(cadena: String): Unit={
    var total:Long = 1
    var valor:Long = 1
    for ( i <- cadena){
      valor = i.toLong
      total *= i
    }
    println(total)
  }

  //Ejercicio 8
  def exEight(cadena: String): Unit={
    var total = 1
    for (i <- 0 until cadena.length) {
      total = total * cadena(i)
    }
    println(total)
  }

  //Ejercicio 9
  def exNine(cadena:String):Long={
    if (cadena.size > 0){
      exNine(cadena.tail) * (cadena.head.toLong)
    } else 1
  }

  //Exercise 10
  def exTen(x: Int, n: Int): Double= {
    if (n == 0) 1
    else {
      if (n < 0) {
        1 / exTen(x, -n)
      } else {
        if (n % 2 == 0) {
          exTen(x, n / 2) * exTen(x, n / 2)
        } else {
          x * exTen(x, n - 1)
        }
      }
    }
  }
}
