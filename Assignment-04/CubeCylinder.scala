abstract class Shape {
  def volume(): Double
  def display(): Unit
}

class Cube(val side: Double) extends Shape {
  def volume(): Double = side * side * side
  def display(): Unit = println(s"Cube Volume: ${volume()}")
}

class Cylinder(val radius: Double, val height: Double) extends Shape {
  def volume(): Double = 3.1416 * radius * radius * height
  def display(): Unit = println(s"Cylinder Volume: ${volume()}")
}

object ShapeDemo {
  def main(args: Array[String]): Unit = {
    val cube = new Cube(4)
    val cyl = new Cylinder(3, 7)

    cube.display()
    cyl.display()
  }
}