package boot

import main.domain.Item
import manage.ItemManager

class ConsoleParser {
  val itemManager: ItemManager = new ItemManager

  def inputParser(csv: String) =
    csv.split(",").foldLeft(List.empty[Item]) { (items, name) =>
      itemManager.findItem(name) match {
        case Some(item) => items :+ item
        case _ =>
          println(s"$name could not be found, please try again.")
          items
      }
    }
}
