object ListMapSetAssignment {

  def listExamples(): Unit = {
    println("=== LIST PROGRAMS ===")

    val list1 = List(1, 2, 3, 4, 5)                   
    val list2 = new java.util.ArrayList[Int]()        
    list2.add(10); list2.add(20); list2.add(30)

    val list3 = List.fill(5)(42)                      
    val list4 = (1 to 10).toList                      
    val list5 = List.tabulate(5)(n => n * n)          

    println(s"List1 (Lisp style): $list1")
    println(s"List2 (Java style): $list2")
    println(s"List3 (fill): $list3")
    println(s"List4 (range): $list4")
    println(s"List5 (tabulate): $list5")

    val a = List(5, 2, 9)
    val b = List(8, 1, 3)
    val mergedSorted = (a ++ b).sorted
    println(s"Merged and Sorted List: $mergedSorted")

    val divBy3 = (1 to 50).filter(_ % 3 == 0).toList
    println(s"Integers divisible by 3 (1–50): $divBy3")

    val evenNums = (1 to 10).filter(_ % 2 == 0)
    val product = evenNums.product
    println(s"Even numbers up to 10: $evenNums, Product: $product")

    val funcList = List.tabulate(10)(n => 3 * n * n + 4 * n + 6)
    println(s"List (3n² + 4n + 6): $funcList")
  }

def mapExamples(): Unit = {
    println("\n=== MAP PROGRAMS ===")

    
    def toUpperCase(str: String): String = str.map(_.toUpper)
    val lowerList = List("scala", "java", "python")
    val upperList = lowerList.map(toUpperCase)
    println(s"Original: $lowerList")
    println(s"Uppercase using map(): $upperList")

    
    val students = Map(
      1 -> "Anuj",
      2 -> "Priya",
      3 -> "Anuj",
      4 -> "Ravi",
      5 -> "Priya"
    )

    println("\nStudents Map (RollNo -> FirstName):")
    students.foreach(println)

    println("\nStudents with same FirstName:")
    val grouped = students.groupBy(_._2)
    for ((name, group) <- grouped if group.size > 1)
      println(s"$name: ${group.keys.mkString(", ")}")
  }

  
  // PART 3: SET
  
  def setExamples(): Unit = {
    println("\n=== SET PROGRAMS ===")

    
    val setA = Set(1, 2, 3, 4, 5)
    val setB = Set(4, 5, 6, 7, 8)
    val common = setA.intersect(setB)
    println(s"Set A: $setA")
    println(s"Set B: $setB")
    println(s"Common elements: $common")

    
    println(s"Largest element: ${setA.max}")
    println(s"Smallest element: ${setA.min}")

    
    val merged = setA ++ setB
    val product = merged.product
    val avg = merged.sum.toDouble / merged.size
    println(s"Merged Set: $merged")
    println(s"Product of elements: $product")
    println(f"Average of elements: $avg%.2f")
  }

  
  // MAIN FUNCTION

  def main(args: Array[String]): Unit = {
    listExamples()
    mapExamples()
    setExamples()
  }
}