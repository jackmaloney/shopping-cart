package service

class OffersService {

  def buyOneGetOneFree(itemCount: Int, cost: BigDecimal): BigDecimal = ((itemCount / 2) + (itemCount % 2)) * cost

  def threeForThePriceOfTwo(itemCount: Int, cost: BigDecimal): BigDecimal = ((itemCount / 3) * 2 + (itemCount % 3)) * cost

}
