object question_6 extends App{

  def fibonacci(n: Int) : Int = {
    if(n<=1) return n
    else (fibonacci(n-1) + fibonacci(n-2))
  }

  for(i <- 0 until 10){
    println(fibonacci(i))
  }

}
