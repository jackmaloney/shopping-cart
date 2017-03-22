package test.service

import main.domain.{Apple, Orange}
import main.service.ShoppingCalculatorService
import org.specs2.mutable.Specification

class ShoppingCalculatorServiceSpec extends Specification {

  "Shopping calculator" should {

    "Return the price one item when only one in shopping basket" in {
      ShoppingCalculatorService.calculateBasketTotal(List(Apple)) mustEqual BigDecimal(0.60)
    }

    "Add the total price of items in the shopping basket for multiple items" in {
      ShoppingCalculatorService.calculateBasketTotal(List(Apple, Apple, Orange, Apple)) mustEqual BigDecimal(2.05)
    }
  }
}
