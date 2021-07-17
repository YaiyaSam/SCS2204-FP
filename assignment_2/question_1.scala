object question_1 extends App{

  def prime(num: Int, x: Int = 2) : Unit = {
    if(num <= x)
      {
        if(num == x)
          {
            println("Yes")
            return
          }
        println("No")
        return
      }
    if(num % x == 0)
      {
        println("No")
        return
      }
    prime(num, x+1)
  }

  prime(5)
  prime(8)

}
