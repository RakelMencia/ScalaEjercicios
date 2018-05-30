class Time2 (h: Int=0, m: Int=0){
  //Pasamos los valores del constructor a minutos
  private var min = h * 60 + m -1
  //Comrpobamos cuál es mayor
  def before(other: Time2) ={
    min < other.min
  }
}

object Ejecutador{
  def main(args: Array[String]): Unit = {
    val a = new Time2(13,25)
    val b = new Time2 (16, 50)
    if (b.before(a)) println("Es mayor el primero")
    else println("Es mayor el segundo")
  }
}
