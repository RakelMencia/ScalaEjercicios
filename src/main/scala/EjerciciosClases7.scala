//Ejercicio 7
class Person2 (name: String){
  val firstName = name.split(" ")(0)
  val lastName = name.split(" ")(1)
  val resul = firstName + ", " + lastName
}

//Ejercicio 8
class Car(val manufacturer : String, val model: String, val year: Int = -1, var license: String = ""){
  override def toString: String = s"Los datos del vehículo son: $manufacturer, $model, $year y $license"
}

//Ejercicio 10
class Employee2{
  //Definimos atributos
  private var name = "John Q. Public"
  private var salary = 0.0
  //Definimos constructor
  def this(na:String, sala:Double){
    this()
    name = na
    salary = sala
  }

  override def toString: String = s"Los datos son: $name, $salary"
}


object Exe{
  def main(args: Array[String]): Unit = {
    val p1 = new Person2("Ramón García")
    println(p1.resul)
    val c1 = new Car("aaaaaa", "bbbbbb")
    println(c1)
    val c2 = new Car("DDDDDD", "dfskdjflsj", 25)
    println(c2)
    val c3 = new Car("dfjsj", "djfskdjfd", 3, "kjdfjsdj")
    println(c3)
    val e1 = new Employee2("Paco", 100.6)
    println(e1)
  }
}
