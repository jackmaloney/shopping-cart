package service

import domain.{BuyOneGetOneFreeOffer, ThreeForPriceOfTwoOffer}
import main.domain.Item

class OffersService {

  def buyOneGetOneFree(itemCount: Int, cost: BigDecimal): BigDecimal = ((itemCount / 2) + (itemCount % 2)) * cost

  def threeForThePriceOfTwo(itemCount: Int, cost: BigDecimal): BigDecimal = ((itemCount / 3) * 2 + (itemCount % 3)) * cost

  def applyOffers(items: List[Item]): BigDecimal  =  {
    val grouped = items.groupBy(identity)

    grouped.foldLeft(BigDecimal(0.0)) { (totalWithOffers, groupedItem) =>
      totalWithOffers + groupedItem._1.offer.map(o => {
        o match {
          case (BuyOneGetOneFreeOffer) => buyOneGetOneFree(groupedItem._2.size, groupedItem._1.price)
          case (ThreeForPriceOfTwoOffer) => threeForThePriceOfTwo(groupedItem._2.size, groupedItem._1.price)
          case _ => BigDecimal(0.0)
        }
      }).getOrElse(groupedItem._2.size * groupedItem._1.price)
    }
  }
}
