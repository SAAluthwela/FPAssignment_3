
object AddEven extends App{
       var total:Int =0;
       var x:Int=0;

    def evenNum(num:Int): Int={
 
     if(num % 2==0 && num!=1){
         x = add(num);
         evenNum(num-1);
     }
      else if(num==0){
            1
     }else if(num==1){
        1
       
    }else{
           evenNum(num - 1);
         }

      }


     def add(num:Int): Int={
         total=total+num;
         return total;
     }
 
            evenNum(5)
            println(x)
}

