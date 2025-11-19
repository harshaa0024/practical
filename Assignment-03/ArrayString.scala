import scala.io.StdIn._
object arraystr{
    def main(args: Array[String]): Unit = {
        val arr = Array("Apple","Banana","Grapes","Pineapple","Orange")
        val str = readLine("Enter The String: ")

        arr.filter(_.contains(str)).foreach(println)
    }
}

