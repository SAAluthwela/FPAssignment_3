object AddNum extends App{
  def add(x:Int):Int=x match{
    case x if(x!=0) => x+add(x-1)
    case _ => x
  }
  println(add(5));
}