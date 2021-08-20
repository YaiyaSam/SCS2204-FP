class Account(n:Int, b:Double) {
  val accountNumber: Int = n
  var balance: Double = b

  override def toString: String = "[" + accountNumber + ":" + balance + "]"
}

object question_4 extends App{

  var bank = List(new Account(1, 3000), new Account(2, 5500), new Account(3,1000.5), new Account(4, -500))

  //question 4.1
  val overDraft = (b:List[Account])=> b.filter(x=>x.balance<0)
  println(overDraft(bank))

  //question 4.2
  val bankBalance=(b:List[Account])=> b.map(_.balance).reduce((x,y)=>(x+y))
  println(bankBalance(bank))

  //question 4.3
  val interest=(b:List[Account])=>b.map(a=>if(a.balance>=0) a.balance=a.balance + a.balance*0.05 else a.balance=a.balance+ a.balance*0.1)
  interest(bank)
  println(bank)

}