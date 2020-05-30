object PrimeNumberChecker extends App{

  def gcd(a:Int,b:Int):Int=b match{
    case 0 => a
    case b if (b>a)=> gcd(b,a)
    case _ => gcd(b,a%b)
  } 
    //Recursive
  def PrimeNumber(n:Int,x:Int=2):Boolean = x match{
    case x if(x==n) => true
    case x if gcd(n,x)>1 => false
    case x => PrimeNumber(n,x+1)
  }

  println(PrimeNumber(17))
  println(PrimeNumber(10))
}


