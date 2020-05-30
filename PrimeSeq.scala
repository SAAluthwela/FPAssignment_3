object PrimeSeq extends App{

  def primeSeq(n:Int,m:Int=2):Unit= {
    if(m==n) return;
    if(prime(m)) print(m)
    if(prime(m))  println("")
    primeSeq(n,m+1)
  }

  def gcd(a:Int,b:Int):Int=b match{
    case 0 => a 
    case b if (b>a) => gcd(b,a)
    case _ => gcd(b,a%b)
  }

  def prime(n:Int,m:Int=2):Boolean = m match{
    case x if(x==n) => true
    case x if gcd(n,m)>1 => false
    case x => prime(n,m+1)
  }

  primeSeq(15)

}



