class Sports(val id: Int, val name: String, val description: String, val amount: Double) {
  def display(): Unit = println(s"ID: $id | Name: $name | Desc: $description | Amount: ₹$amount")
}

class Indoor(id: Int, name: String, description: String, amount: Double)
  extends Sports(id, name, description, amount)

class Outdoor(id: Int, name: String, description: String, amount: Double)
  extends Sports(id, name, description, amount)

object SportsDemo {
  def main(args: Array[String]): Unit = {
    val chess = new Indoor(1, "Chess", "Board game", 500)
    val cricket = new Outdoor(2, "Cricket", "Outdoor team game", 1500)

    println("Indoor Sports:")
    chess.display()
    println("\nOutdoor Sports:")
    cricket.display()
  }
}