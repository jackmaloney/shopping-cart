package boot

import main.domain.{Apple, Orange}
import org.specs2.mutable.Specification

class ConsoleParserSpec extends Specification{

  val consoleParser = new ConsoleParser

  //Would use mockito to mock the available list when implementing in real life
  "input parser" should {
    "find an item if it is in the available list" in {
      consoleParser.inputParser("apple") mustEqual List(Apple)
    }

    "find a list of items if they are all in available list" in {
      consoleParser.inputParser("apple,apple,orange") mustEqual List(Apple, Apple, Orange)
    }

    "Return a list of just one item if two items could not be found" in {
      consoleParser.inputParser("car,bike,orange") mustEqual List(Orange)
    }
  }

}
