object Demo {
  def main(args: Array[String]) {

    val name = "mark"
    val age = 18.5
    println(name+" is " +age+" years old")

    println(s"$name is $age years old")

    println(f"$name%s is $age%f years old")

    println(raw"Hello \nWorld")
  }
}
