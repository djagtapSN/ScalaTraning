package Traits

trait Feline {
  def color:String
  def sound:String
}

case class Lion(color:String,manSize:Int) extends Feline{
  val sound = "roar"
}

case class Tiger(color:String) extends Feline{
  val sound = "roar"
}
case class Panther(color:String, food:String) extends Feline{
  val sound = "roar"
}

object traitDemo extends App{
  val a = Tiger("Black")
  println(a)
}
