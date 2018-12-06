object ForLoop {

  def main(args: Array[String]): Unit = {

    for (i <- 1.to(5)) {
      println("i using  to " + i)
    }

    for (i <- 1.until(5)) {
      println("i using  until " + i)
    }

    for (i <- 1 to 6; j <- 1 to 3) {
      println("i using  until " + i + " " + j)
    }

    val lst = List(1, 2, 4, 5, 6, 7, 8)

    val result = for {i <- lst} yield i * i

    println("Final LIst is" +result)
  }
}
