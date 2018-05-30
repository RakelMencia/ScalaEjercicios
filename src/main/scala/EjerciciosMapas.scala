import scala.collection.immutable.{ListMap, TreeMap}
import scala.collection.mutable.ArrayBuffer
import scala.io.Source
import java.util.Calendar._
import scala.collection.JavaConversions._

object EjerciciosM{
  def main(args: Array[String]): Unit = {
    //tuplesOne()
    //println(tuplesTwo())
    //println(tuplesFour())
    //tuplesFive()
    //tuplesSix()
    //tuplesSeven()
    val a = Array[Int](6,23,5,9,-30,74,0,-18,31)
    //tuplesEight(a)
    //tuplesNine(a, 20)
    tuplesTen()
  }

  //EJercicio 1
  def tuplesOne(): Unit={
    val mapGizmo = Map("ipad" -> 300, "television" -> 600, "iphone" -> 1000)
    val mapGizmoD = for ((k,v) <- mapGizmo) yield (k, v*0.9)
    println(mapGizmo)
    println(mapGizmoD)
  }

  //Ejercicio 2
  def tuplesTwo(): Map[String, Int]={
    var contador = 0
    val filename = "myfile.txt"
    val bf = Source.fromFile(filename)
    //var mapa = scala.collection.mutable.Map[String, Int]()
    var array = new ArrayBuffer[String]()
    var values = new ArrayBuffer[Int]()
    for (line <- bf.getLines()){
      array.append(line.toLowerCase())
    }
    bf.close()
    for (item <- array){
      for (i <- 0 until array.length){
        if (item.toUpperCase().equals(array(i).toUpperCase())) contador = contador + 1
      }
      values.append(contador)
      contador = 0
    }
    val newMap = array.zip(values)
    newMap.toMap
  }

  //Ejercicio 4
  def tuplesFour():Unit={
    val lista = ListMap(tuplesTwo().toSeq.sortBy(_._1):_*)
    println(lista)
  }

  //Ejercicio 5
  def tuplesFive():Unit={
    val t = TreeMap(tuplesTwo().toSeq:_*)
    println(t)
  }

  //Ejercicio 6
  def tuplesSix():Unit={
    val dias = scala.collection.mutable.LinkedHashMap(
      "Monday" -> MONDAY,
      "Tuesday" -> TUESDAY,
      "Wednesday" -> WEDNESDAY,
      "Thursday" -> THURSDAY,
      "Friday" -> FRIDAY,
      "Saturday" -> SATURDAY,
      "Sunday" -> SUNDAY
    )

    for ((k,v)<-dias){
      println(s"Clave: $k, Valor: $v")
    }
  }

  //Ejercicio 7
  def tuplesSeven():Unit={
    val systemp = System.getProperties()

    val maxkey = systemp.max
    println(s"The longest key is $maxkey")

    for( (k,v) <- systemp ) {
      println(s"Clave: $k, Valor: $v")
    }
  }

  //Ejercicio 8
  def tuplesEight(values: Array[Int]):Unit={
    val max = values.max
    val min = values.min
    val mapa = Map(max -> min)
    println(mapa)
  }

  //Ejercicio 9
  def tuplesNine(values: Array[Int], v:Int):Unit={
    var less = 0
    var equal=0
    var greater=0
    for (a <- values){
      if (a < v){
        less = less + 1
      } else if (a > v){
        greater = greater + 1
      } else {
        equal = equal + 1
      }
    }

    val tupla = Tuple3(less, equal, greater)
    println(tupla)
  }

  //Ejercicio 10
  def tuplesTen():Unit={
    println("hello".zip("World"))
  }
}
