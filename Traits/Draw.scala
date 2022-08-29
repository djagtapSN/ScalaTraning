package Traits

sealed trait Shape1 {
  def sides:Int
  def perimeter:Double
  def area:Double
}

case class Circle(radius:Double) extends Shape1 {
  val sides = 1
  val area = math.Pi * radius * radius
  val perimeter = 2 * math.Pi * radius
}

object Draw3{
  def apply(shape: Shape1) :String = shape match {
    case Circle(rad) => s"A cirlce of radius ${rad}cm"
  }
}

object DemoShape extends App{
  println(Draw3(Circle(2)))
}
