class Project(var id: Int, var name: String, var location: String) {
  def display(): Unit = println(s"Project ID: $id | Name: $name | Location: $location")
}

object ProjectDemo {
  def main(args: Array[String]): Unit = {
    val p1 = new Project(1, "Online Exam System", "Pune")
    val p2 = new Project(2, "Portfolio Website", "Mumbai")

    println("Project Details:")
    p1.display()
    p2.display()
  }
}