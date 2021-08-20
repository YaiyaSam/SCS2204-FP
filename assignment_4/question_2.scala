class Rational(x: Int, y: Int) {
  def numer: Int = x
  def denom: Int = y

  def -(r: Rational) = new Rational(this.numer*r.denom - r.numer*this.denom, this.denom*r.denom)

  override def toString: String = numer + "/" + denom
}
object question_2 extends App{
  val x = new Rational(3, 4)
  val y = new Rational(5, 8)
  val z = new Rational(2, 7)

  println(x-y-z)
}
