class currentaccount(val accNo: Int, val name: String, var balance: Double, val minBalance: Double) {

  def deposit(amount: Double): Unit = {
    if (amount > 0) {
      balance += amount
      println(s"Deposited ₹$amount. Updated Balance: ₹$balance")
    } else {
      println("Deposit amount must be positive.")
    }
  }
 
  def withdraw(amount: Double): Unit = {
    if (amount > 0 && balance - amount >= minBalance) {
      balance -= amount
      println(s"Withdrew ₹$amount. Updated Balance: ₹$balance")
    } else if (amount <= 0) {
      println("Withdrawal amount must be positive.")
    } else {
      println(s"Insufficient balance! Minimum balance of ₹$minBalance must be maintained.")
    }
  }

  def viewBalance(): Unit = {
    println(s"Account No: $accNo | Name: $name | Balance: ₹$balance")
  }
}

object BankApp {
  def main(args: Array[String]): Unit = {
    val account = new currentaccount(101, "Srushti Khamkar", 6000.0, 1000.0)

    account.viewBalance()
    account.deposit(2000)
    account.withdraw(1500)
    account.withdraw(6000)
    account.viewBalance()
  }
}