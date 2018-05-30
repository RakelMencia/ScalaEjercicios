class BankAccount{
  //Creamos la variable balance, la inicializamos a 0
  private var balance = 0
  //Esta función suma al balance la cantidad indicada
  def deposit(m: Int):Int={
    balance = balance + m
    balance
  }
  def withdraw(wm: Int):String = {
    //En función de si el balance es positivo o negativo, se imprime un mensaje u otro
    if (balance-wm>=0) "Le quedan " + (balance-wm) + "€" else "Saldo insuficiente"}
}
