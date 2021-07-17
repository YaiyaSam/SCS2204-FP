object question_3 extends App{

   def add(n : Int) : Int = {
     if(n == 1) return n
     add(n-1) + n
   }

   println(add(5))
}
