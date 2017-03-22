package boot

import main.service.ShoppingCalculatorService

object Launch {
  def main(args: Array[String]): Unit = {
    println("Shopping calculator has started!")

    val parser = new ConsoleParser
    val console = System.console().readLine("Please enter a comma separated list of items: ")

    try {
      val items = parser.inputParser(console)

      println(s"Your total bill is £${ShoppingCalculatorService.calculateBasketTotal(items)}")

    } catch {
      case e: Exception => println(e.getMessage)
    }
  }
}


