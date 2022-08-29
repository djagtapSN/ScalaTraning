package Traits

sealed trait color{
  def red: Double
  def green:Double
  def blue:Double

  def isLight = (red + green + blue)/3.0 >0.5
  def isDark = !isLight
}

case object Red extends color{
  override def red: Double = 1.0

  override def green: Double = 0.0

  override def blue: Double = 0.0
}

case object Green extends color{
  override def red: Double = 0.0

  override def green: Double = 1.0

  override def blue: Double = 0.0
}

case object Pink extends color{
  override def red: Double = 1.0

  override def green: Double = 1.0

  override def blue: Double = 1.0
}

final case class CustomColor(red:Double,green:Double,blue:Double)extends color

sealed trait shape4 {
  def sides: Int
  def perimeter: Double
  def area: Double
  def color: color
}

sealed trait Rectangular3{
  val sides:Int= 4
}

final case class Circle2(radius:Double, color:color) extends shape4{
  val sides = 1
  val perimeter = 2 * math.Pi * radius
  val area = math.Pi * radius * radius
}

case class Rectangle3(length:Double, width:Double,color: color) extends shape4 with Rectangular3 {
  //  override val sides: Int = 4
  override def perimeter: Double = 2 * (length * width)
  override def area: Double = length * width
}
case class Square3(side :Double,color: color) extends shape4 with Rectangular3{
  //  override val sides : Int = 4
  override def perimeter: Double = 4 * side
  override def area: Double = side * side
}
object Draw{
  def apply(shape4:shape4):String= {
    shape4 match {
      case Circle2(radius, color) => s"${color} color circle has radius ${radius} cm"
      case Rectangle3(length, width, color) => s"${color} color rectangle has length ${length}cm and width ${width}cm"
      case Square3(side, color) => s"${color} color square has side ${side}cm"
    }
  }
  def apply(color: color): String = color match {
    case Pink => "pink"
    case Red => "Red"
    case color => if(color.isLight) "light" else "dark"
  }

}
object ShapeDemo4 extends App{
  println(Draw(Circle2(10,Red)))
  println(Draw(Square3(12.10,CustomColor(1.0,0.2,0.1))))
}