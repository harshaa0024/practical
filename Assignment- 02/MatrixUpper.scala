import scala.io.StdIn._
object UpperTriangular{

    def main(args:Array[String])={

        val matrix = Array(
            Array(7,2,3),
            Array(4,5,4),
            Array(7,3,9)
        )
        var u = true

        for(i<-1 until 3 ; j<-0 until i){
            if(matrix(i)(j) != 0){
                u = false
            }
        }
        if(u){
            println("Matrix is Upper Triangular")
        }
        else{
         println("Matrix is not Upper Triangular")
        }
}
}
