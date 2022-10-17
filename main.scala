import cats.effect.IO
import cats.effect.Resource
import cats.effect.unsafe.implicits.global

object Configuration {
  println("000")
  //Resource.eval(IO(println("AAA"))) // hangs in 2.13.10, works in 3.2.0
  //Resource.eval(IO.blocking(println("AAA"))) // hangs in 2.13.10, works in 3.2.0
  Resource.eval(IO.println("AAA")) // works in 2.13.10, works in 3.2.0
    .allocated
    .unsafeRunSync()
  println("111")

  val unit = {
    println("000")
    //Resource.eval(IO(println("AAA"))) // hangs in 2.13.10, works in 3.2.0
    //Resource.eval(IO.blocking(println("AAA"))) // hangs in 2.13.10, works in 3.2.0
    Resource.eval(IO.println("AAA")) // works in 2.13.10, works in 3.2.0
      .allocated
      .unsafeRunSync()
    println("111")
  }

  val x = 1
}

object Main {
  def main(args: Array[String]): Unit = {
    println(s"main start")
    println(s"Using it ${Configuration.x}")
    println(s"main end")
  }
}
