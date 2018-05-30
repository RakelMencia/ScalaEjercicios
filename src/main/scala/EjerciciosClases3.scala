class Time(private var h: Int=0, private var m: Int=0){
  //Declaramos las var de horas y minutos
  private var hours=h
  private var minutes=m
  //Pasamos como argumento un objeto de tipo Time que hayamos creado
  def before(other: Time): Boolean={
    //Hacemos las comprobaciones para ver si son mayor o menor las horas y los minutos
    if (other.hours>hours){
      true
    } else if (other.hours<hours){
      false
    } else {
      if (other.minutes>minutes){
        true
      } else {
        false
      }
    }
  }
}

object Ejecutado{
  def main(args: Array[String]): Unit = {
    val tiempo1 = new Time(10, 30)
    val tiempo2 = new Time(10, 35)
    if (tiempo1.before(tiempo2)){
      println("El tiempo 2 es posterior")
    } else {
      println("El tiempo 1 es posterior")
    }
  }
}
