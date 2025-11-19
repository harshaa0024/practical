abstract class Order(val id: Int, val description: String) {
  def display(): Unit
}

class PurchaseOrder(id: Int, description: String, val vendor: String)
  extends Order(id, description) {
  def display(): Unit = println(s"PurchaseOrder -> ID: $id | Desc: $description | Vendor: $vendor")
}

class SalesOrder(id: Int, description: String, val customer: String)
  extends Order(id, description) {
  def display(): Unit = println(s"SalesOrder -> ID: $id | Desc: $description | Customer: $customer")
}

object OrderDemo {
  def main(args: Array[String]): Unit = {
    val p = new PurchaseOrder(101, "Office Supplies", "ABC Traders")
    val s = new SalesOrder(201, "Laptops", "XYZ Pvt Ltd")

    p.display()
    s.display()
  }
}