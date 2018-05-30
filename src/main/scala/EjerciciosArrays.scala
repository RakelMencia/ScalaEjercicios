import java.awt.datatransfer._

import scala.collection.{immutable, mutable}
import scala.collection.mutable.ArrayBuffer
import collection.JavaConversions.asScalaBuffer
import collection.mutable.Buffer

object EjerciciosA{
  def main(args: Array[String]): Unit = {
    arrayOne(9)
    //arrayTwo()
    //println(arrayThree())
    //arrayFour()
    //println(arrayFive())
    //println(arraySix())
    //arraySeven()
    //arrayNine()
    //arrayTen()
  }

  //CHAPTER 3
  //Ejercicio 1
  def arrayOne(n: Int):Unit={
    var array = new ArrayBuffer[Int]()
    for (i <- 0 until n){
      array+=i
    }
    println(array)
  }

  //Ejercicio 2
  def arrayTwo():Unit={
    val a = Array[Int](7,15,12,26,53)
    val b = ArrayBuffer[Int]()
    for(i <- 0 until a.length) {
      //println("i: " + i)
      if (i<a.length-1){
        b.append(a(i+1))
      } else {
        b.append( a(i-1))
      }
    }
    println(b)
  }

  //Ejercicio 3
  def arrayThree():immutable.IndexedSeq[Int]={
    val a = Array[Int](7,15,12,26,53)
    for (i <- 0 until a.length)
      yield if (i%2==0 && i>0)
        a(i-1)
      else a(i+1)
  }

  //Ejercicio 4
  def arrayFour():Unit={
    val a = Array[Int](6,23,5,9,-30,74,0,-18,31)
    val b =for (i<-a if i>0) yield i
    val c = for (i<-a if i==0) yield i
    val d = for (i<-a if i<0) yield i
    val total = b++c++d
    println(total.mkString(", "))
  }

  //Ejercicio 5
  def arrayFive():Double={
    val a = Array[Double](6,23,5,9,30,74,0,18,31,8)
    val suma = a.sum
    suma/a.length
  }

  //Ejercicio 6
  def arraySix():Unit={
    val a = Array[Int](6,23,5,9,30,74,0,18,31,8)
    val b = a.sortWith(_ > _)
    println(b.mkString(", "))
    println("-------------------------")
    val c = ArrayBuffer[Int](6,23,5,9,30,74,0,18,31,8)
    val d = c.sortWith(_ > _)
    println(d)
  }

  //Ejercicio 7
  def arraySeven():Unit={
    val a = ArrayBuffer[Int](6,23,5,9,30,6,74,0,18,0,31,8)
    println(a.distinct)
  }

    //Ejercicio 9
  def arrayNine(): Unit= {
    val zonas = java.util.TimeZone.getAvailableIDs()
    val zonasA = zonas.filter(_.startsWith("America/")).map(_.drop("America/".size))
    println(zonasA.mkString(", "))
  }

  //Ejercicio 10
  def arrayTen():Unit={
    val flavors = SystemFlavorMap.getDefaultFlavorMap.asInstanceOf[SystemFlavorMap]
    val imagen: Buffer[String] = flavors.getNativesForFlavor(DataFlavor.imageFlavor)
    println(imagen)
  }
}
