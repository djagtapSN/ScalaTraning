package Traits

trait Shape {
  def sides:Int
  def perimeter:Double
  def area:Double
}

case class Circle1(radius:Double) extends Shape {
  val sides = 1
  val area = math.Pi * radius * radius
  val perimeter = 2 * math.Pi * radius
}

case class Square(side:Double) extends Shape{
  override def sides: Int = 4
  override def perimeter: Double = 4 * side
  override def area: Double = side * side
}

object areaDemo extends App{
  val a = Circle1(2.0)
  println(a.area)

  val square = Square(2.0)
  println("Sides of sqaure is "+square.sides)
  println("Perimeter of sqaure is "+square.perimeter)
  println("Area of sqaure is "+square.area)
}


