import scala.util.control.Breaks._

object question_2 extends App{

  def primeSeq(num:Int) : Unit = {
    var flag : Int = 0
    if(num<=2){
        if(num == 2){
            println(num)
            return
        }
        return
    }
    breakable{
      for(i <- 2 until num-1){
        if(num%i == 0){
          flag = 1
        }
        if(flag == 1) break
      }
      if(flag == 0) println(num)
    }
    primeSeq(num-1)
  }
  primeSeq(10)
}
