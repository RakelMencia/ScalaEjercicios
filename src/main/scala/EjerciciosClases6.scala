class Person(var age: Int=0){
  if (age<0) age = 0
  else age
}

object Ex{
  def main(args: Array[String]): Unit = {
    val p1 = new Person(35)
    println(p1.age)
    val p2 = new Person(-95)
    println(p2.age)
  }
}
