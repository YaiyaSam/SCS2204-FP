class Rational( x: Int, y: Int) {
  def numer: Int = x
  def denom: Int = y

  def neg = new Rational(-this.numer, this.denom)

  override def toString: String = numer + "/" + denom
}

object question_1 extends App{
  val a = new Rational(2, 5)
  println(a.neg)
}
