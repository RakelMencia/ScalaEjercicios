
import scala.io.Source
import java.io.PrintWriter
import java.util


object EjerciciosAr{
  def main(args: Array[String]): Unit = {
    //ex1()
    //ex2()
    ex3()
  }

  //Ejercicio 1
  def ex1():Unit={
    val source = Source.fromFile("other").getLines.toArray.reverse
    val out = new PrintWriter("Ejercicio1.txt")
    out.println(source.mkString("\n"))
    out.close()
  }

  //Ejercicio 2
  def ex2():Unit={
    val texto = Source.fromFile("other").mkString.replaceAll("\t", " ")
    val out = new PrintWriter("Ejercicio2.txt")
    out.print(texto)
    out.close()
  }

  //Ejercicio 3
  def ex3():Unit={
    val texto = Source.fromFile("other").mkString.split("\\s+").filter(_.length > 12)
    println(texto.mkString(", "))
  }

}
