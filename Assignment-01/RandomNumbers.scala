import scala.io.StdIn._
import scala.util.Random
object Perfect{
    def main(args: Array[String])={
        var rand = Random.nextInt(100)

        for(i<-1 until 10){
            print(rand)
            perfect(rand)
            rand = Random.nextInt(500)
        }
    }
    def perfect(num:Int)={
        var sum = 0
        for(i<-1 until num){
            if(num%i==0){
                sum=sum+i
            }
        }
        if(sum==num){
            println("The number is perfect")
            }
             else
                println("The number is not perfect")
        }
    }