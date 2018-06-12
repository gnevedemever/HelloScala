//Models a pizza
class Pizza(val height: Int, val width: Int, var composition: Array[Array[Char]] = null) {
  //  println(s"Creating ${toString}")

  //  val composition = Array[Int](height,width)

  //  def this (height: Int, width: Int, compositionArg: Array[Int]) {
  //    composition = compositionArg
  //  }


  override def toString: String = {
    println(s"Pizza of height $height and width $width\n\n")

    for {i <- 0 until height
         j <- 0 until width} {
      print(s"${composition(i)(j)}")
      if (j == width - 1) { print("\n") }
    }

    s"Pizza of height $height and width $width\n\n"
  }

}

val pizza = new Pizza(3,5)
var composition = Array.ofDim[Char](3,5)
composition = Array(Array('T', 'T', 'T', 'T', 'T'), Array('T', 'M', 'M', 'M', 'T'), Array('T', 'T', 'T', 'T', 'T'))
pizza.composition = composition
pizza.toString
