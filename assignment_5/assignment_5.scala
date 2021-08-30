import scala.math.sqrt

case class Point (var x: Int, var y: Int) {
  def +(p: Point): Point = Point(x + p.x, y + p.y)

  def move(dx: Int, dy: Int) = {
    this.x = this.x + dx
    this.y = this.y + dy
  }

  def distance(p: Point): Double = {
    val n = ((p.x - this.x)*(p.x - this.x) + (p.y - this.y)*(p.y - this.y))
    return sqrt(n)
  }

  def invert() = {
    val temp = this.x
    this.x = this.y
    this.y = temp
  }

}

object assignment_5 extends App {
  val p1 = Point(1, 2)
  val p2 = Point(3, 2)

  //add two points
  val p3 = p1 + p2
  println(p3)

  //move point by a given distance
  p3.move(2, 1)
  println(p3)

  //distance between two points
  println(p3.distance(p1))
  println(p3)

  //switch x and y coordinates
  p3.invert()
  println(p3)
}