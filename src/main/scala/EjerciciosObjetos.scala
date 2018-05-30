
object EjerciciosO{
  def main(args: Array[String]): Unit = {
    //println(InchesToCentimeters.conversor(10))
    //println(Punto1)
    //println(Baraja.toString())
    for(c <- Colors.values) println(c)
  }
}

//Ejercicio 1
object Conversion{
  private def inchesToCentimeters(inches: Double): Double={
    var cm=inches*2.54
    cm
  }
  private def gallonsToLiters(gallons: Double): Double={
    var liters= gallons*3.78541
    liters
  }
  private def milesToKilometers(miles: Double): Double={
    var km = miles*1.60934
    miles
  }
}

//Ejercicio 2
class UnitConversion(valor: Double){
  def conversor(factor:Double): Double={
    val resultado = factor*valor
    resultado
  }
}
//Creamos los objetos a partir de la clase anterior
object InchesToCentimeters extends UnitConversion(2.54)
object GallonsToLiters extends UnitConversion(3.78541)
object MilesToKilometers extends UnitConversion(1.60934)

//Ejercicio 4
class Point(x:Int, y:Int) extends java.awt.Point{
  override def toString: String = "This is the class Point"
}

//Creamos el companion object
object Punto1 extends Point(3,4)

//Ejercicio 5
object Reverse extends App{
  println(args.reverse.mkString(", "))
}

//Ejercicio 6
object Baraja extends Enumeration{
  val a = Value("oros")
  val b = Value("copas")
  val c = Value("espadas")
  val d = Value("bastos")
  override def toString():String={
    val sentencia = "Los cuatro palos de la baraja son: " + a + ", " + b + ", " + c + " y " + d + "."
    sentencia
  }
}

//Ejercicio 8
object Colors extends Enumeration{
  val r = Value(0xff0000, "red")
  val g = Value(0x00ff00, "green")
  val b = Value(0x0000ff, "blue")
  val rg = Value(0xffff00, "red-green")
  val rb = Value(0xff00ff, "red-blue")
  val gb = Value(0x00ffff, "green-blue")
  val bck = Value(0x000000, "black")
  val w = Value(0xffffff, "white")
}