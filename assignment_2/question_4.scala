object question_4 extends App{

  def oddEven(num: Int) : Unit = {

    if(num == 1) {
      println("Odd Number")
      return
    }
    if(num == 0) {
      println("Even Number")
      return
    }
    else oddEven(num % 2)
  }
  oddEven(33)
}
