object MaxMinArray{
    def main(args: Array[String]): Unit = {
        val arr = Array(12,45,6,22,88,3,39)

        val maxVal = arr.max

        val minVal = arr.min

        println(s"Array elements: ${arr.mkString(", ")}")
        println(s"Maximum element is: $maxVal")
        println(s"Minimum element is: $minVal")
    }
}