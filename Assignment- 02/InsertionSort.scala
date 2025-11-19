object InsertionSortExample {
  def main(args: Array[String]): Unit = {
    println("Enter number of elements:")
    val n = scala.io.StdIn.readInt()

    val arr = new Array[Int](n)
    println(s"Enter $n elements:")
    for (i <- 0 until n) {
      arr(i) = scala.io.StdIn.readInt()
    }

    for (i <- 1 until n) {
      val key = arr(i)
      var j = i - 1

      while (j >= 0 && arr(j) > key) {
        arr(j + 1) = arr(j)
        j = j - 1
      }
      arr(j + 1) = key
    }

    println("Sorted Array using Insertion Sort:")
    arr.foreach(println)
  }
}
