object PrimeNum {
  def main(args: Array[String]): Unit = {
    println("Prime numbers from 1 to 100 are")

    for (num <- 2 to 100) {
      var isPrime = true
      var n=num/2

      for (i <- 2 to n) {
        if (num % i == 0) {
          isPrime = false
        }
      }

      if (isPrime) {
        println(s"$num")
      }
    }
  }
}
