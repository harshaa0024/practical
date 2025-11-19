import scala.io.StdIn._

object AverageCalculator {
    def main(args: Array[String]): Unit = {
        print("Enter the first number (n1): ")
        val n1 = readInt()

        print("Enter the second number (n2): ")
        val n2 = readInt()

        val start = math.min(n1,n2)
        val end = math.max(n1,n2)

        var sum = 0
        var count = 0

        for(i<-start to end){
            sum += i
            count += 1
        }

        val average = sum/count

        println(s"The average of numbers between $start and $end is: $average")
    }
}