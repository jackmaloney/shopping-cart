package main.service

import main.domain.Item

/**
  * Created by Jack on 22/03/2017.
  */
object ShoppingCalculatorService {

  def calculateBasketTotal(items: List[Item]): BigDecimal = {
    items.foldLeft(BigDecimal(0.0)) { (total, i) =>
      total + i.price
    }
  }

}
