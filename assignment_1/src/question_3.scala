object question_3 {

  var price: Double = 24.95 * 0.6

  def main(args: Array[String]): Unit = {
    println(getTotal(60))
  }

  def getTotal(books: Int): Double = {
    if (books > 50) {
      return (price * books + 3 * 50 + 0.75 * (books - 50))
    }
    else return (price * books + 3 * books)

  }

}
