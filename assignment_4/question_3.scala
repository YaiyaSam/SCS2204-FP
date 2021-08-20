class Account(n:Int, b:Double) {
  val accountNum: Int = n
  var balance: Double = b

  def transfer(a: Account, b: Double) = {
    this.balance = this.balance - b
    a.balance = a.balance + b
  }
  override def toString: String = "[" + accountNum + ":" + balance + "]"
}

object question_3 extends App{
  var x = new Account(1, 2000.50)
  var y = new Account(2, 1000)
  x.transfer(y, 1000)
  println(x)
  println(y)
}