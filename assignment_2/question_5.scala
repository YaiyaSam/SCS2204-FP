object question_5 extends App{

  def evenSum (n: Int): Int = {
    if (n == 0) return n
    if (n % 2 == 0) return (evenSum(n - 1) + n)
    else return evenSum(n - 1)
  }
  println(evenSum(5))


}