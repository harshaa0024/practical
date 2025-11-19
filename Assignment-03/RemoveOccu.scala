import scala.io.StdIn._
object Removeoccurrence{
    def main(args: Array[String]): Unit = {
       
        println("Enter the First String:")
        val str1 = readLine()

        println("Enter the Second String:")
        val str2 = readLine()

        val result = str1.replace(str2,"")

        println("Result: "+result) 

    }
}