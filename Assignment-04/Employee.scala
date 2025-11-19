import scala.io.StdIn._

class Employee(var id: Int, var name: String, var salary: Double) {
  def display(): Unit = println(s"ID: $id | Name: $name | Salary: ₹$salary")
}

object EmployeeDemo {
  def main(args: Array[String]): Unit = {
    val employees = Array(
      new Employee(1, "Srushti", 55000),
      new Employee(2, "payal", 65000),
      new Employee(3, "Abhi", 48000)
    )

    println("\nEmployee Details:")
    employees.foreach(_.display())

    val maxSalaryEmp = employees.maxBy(_.salary)
    println(s"\nEmployee with Maximum Salary:")
    maxSalaryEmp.display()
  }
}