object FibonacciSeries extends App{

   //Recursive section
  def fibo(x:Int):Int = x match{
    case x if(x==0) => 0
    case x if(x==1) => 1
    case x => fibo(x-1)+fibo(x-2)
  }

  def fSeq(x:Int):Any ={
    if (x>0) fSeq(x-1)
    print(fibo(x))
    print(" ")
  }
  
  fSeq(3)
}