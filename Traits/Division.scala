package Traits


sealed trait DivisionResult
final case class Finite(value: Int) extends DivisionResult
case object Infinite extends DivisionResult

object divide {
  def apply(int1:Int,int2:Int): DivisionResult =
    if(int1 == 0) Infinite else Finite(int1 / int2)

  divide(1, 0) match {
    case Finite(value) => s"It's finite: ${value}"
    case Infinite => s"It's infinite"
  }

  def main(args: Array[String]): Unit = {
    println(divide(7, 2))
    println(divide(7, 0))
    println(divide(1, 2))
    println(divide(1, 0))
  }
}


