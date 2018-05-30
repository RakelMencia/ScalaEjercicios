object Ejecutar{
  def main(args: Array[String]): Unit = {
    //contador(81)
    //beber(26)
    //beberPais(1, "España")
    //println(calculo(10,2))
    //println(calculoBis(10,2))
    //println(calculoMap(10,2))
    //ultimo(List(1,2,3,4,5,6,88))
    //cantidadElementos(List(1,2,3,4,5,6,88))
    //invertirLista(List(1,2,3,4,5,6,88))
    //palindromo(List("a", "b", "c", "b", "a"))
    //eliminar(List(1,2,3,4,4,5,6,88,6,46,4))
    //for (a <- 0 until 10) println(fibonacci(a))
      //println (i)
    //}
    //penultimo(List(1,2,3,4,4,5,6,88,6,46))
    aplanar(List(List(1,2,3,4), List(4,5,6,7), List(6,7,8,9)))
  }

  //2. Crear	una	función	que	dado	una	edad	nos	indique	si	la	persona	puede	beber	o	no
  def beber(edad: Int): Unit={
    if(edad>=18) println("Puedes beber") else println("No puedes beber")
  }

  /*3. Crear	 una	 función	 que,	 dado	 una	 edad	 y	 país,	 indique	 si	 la	 persona	 puede	 beber	 o	 no
  (Hacerlo	solo	para	USA	y	España)*/
  def beberPais(edad: Int, pais: String): Unit ={
    if (edad>=18){
      if(pais.equals("USA")) println("En USA no puedes beber") else println("En España sí")
    } else {
      println("No puedes beber")
    }
  }

  //4. Crear una función recursiva que devuelva los primeros 10 elementos de serie de Fibonacci.
  def fibonacci(a:Int):Int={
    //for (a <-0 until 10){
      if ((a==0) || (a==1)){
        a
      } else {
        fibonacci(a-1) + fibonacci(a-2)
      }
    //}
  }

  //5. Implementa	una	 función	que	 se	llame	calculo	y	devuelva	la	 suma,	 resta,	multiplicación	y
  //división	de	dos	números	enteros.
  def calculo(a: Int, b: Int):(Int, Int, Int, Int)={
    (a+b, a-b, a*b, a/b)
  }

  //6. Amplia	el	anterior	añadiendo	una	especificación	con	el	cálculo	realizado.
  def calculoBis(a: Int, b: Int):((String, Int), (String, Int), (String, Int), (String, Int))={
    (("suma", (a+b)), ("resta", (a-b)),("multiplica", (a*b)),("divide", (a/b)))
  }

  def calculoMap(a: Int, b: Int):Map[String, Int]={
    var x = Map("suma"->(a+b), "resta"->(a-b), "multiplica" -> (a*b), "divide" -> (a/b))
    x
  }

  //7. Encuentra	el	último	elemento	de	una	lista
  def ultimo(lista:List[Int]):Unit={
    println(lista.lastOption)
    println(lista.filter(_>4))
    println(lista.filter(_>4).map(_*100))
  }

  //8. Encuentra el penúltimo elemento de una lista.
  def penultimo(lista:List[Int]):Unit={
    val nuevaLista = lista.takeRight(2)
    println(nuevaLista.head)
  }

  //9. Encuentra	la	cantidad	de	elementos	de	una	lista.
  def cantidadElementos(lista:List[Int]):Unit={
    println(lista.size)
  }

  //10.Invierte	una	lista.
  def invertirLista(lista:List[Int]):Unit={
    println(lista.reverse)
  }

  //11. Averiguar	si	una	lista	es	un	palíndromo.
  def palindromo(lista:List[String]):Unit={
    if (lista==lista.reverse) println("Es palíndromo") else println("No lo es")
  }

  //12. Aplanar una estructura de lista anidada.
  def aplanar(lista1:List[List[Int]]):Unit={
    println(lista1.flatten)
  }

  //13. Eliminar	 duplicados	 consecutivos	 de	 elementos	 de	 lista. Si	 una	 lista	 contiene	 elementos
  //repetidos,	deben	reemplazarse	con	una	sola	copia	del	elemento.	El	orden	de	los	elementos
  //no	debe	ser	cambiado.
  def eliminar(lista:List[Int]):Unit={
    println(lista.toSet)
  }

}


