package frp

/**
  * Created by cl on 2016/1/15.
  */

class BankAccount {
  val balance = Var(0)
  def deposit(amount: Int): Unit =
    if (amount > 0) {
      val old = balance()
      balance() = old + amount
    }

  def withdraw(amount: Int) : Unit =
    if( 0 < amount && amount <= balance())
    {
      val old = balance()
      balance() = old - amount
    }else throw new Error("insufficent funds")
}
