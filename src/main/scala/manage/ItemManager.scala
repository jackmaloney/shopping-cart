package manage

import main.domain.{Apple, Item, Orange}

class ItemManager {

  private val allItems = List(Apple, Orange)

  def findItem(itemName: String): Option[Item] = allItems.find(_.name.toLowerCase == itemName.toLowerCase)

}
