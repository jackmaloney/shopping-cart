package service

import org.specs2.mutable.Specification

class OffersServiceSpec extends Specification {

  val offersService = new OffersService

  "buyOneGetOneFree" should {
    "give one item for free when two of the same item" in {
      offersService.buyOneGetOneFree(2, BigDecimal(20)) mustEqual BigDecimal(20)
    }

    "give one item for free when three of the same item" in {
      offersService.buyOneGetOneFree(3, BigDecimal(20)) mustEqual BigDecimal(40)
    }

    "give two items for free when four of the same item" in {
      offersService.buyOneGetOneFree(4, BigDecimal(20)) mustEqual BigDecimal(40)
    }

    "give no items for free when one of the same item" in {
      offersService.buyOneGetOneFree(1, BigDecimal(20)) mustEqual BigDecimal(20)
    }
  }

  "threeForThePriceOfTwo" should {
    "give one item for free when three of the same item" in {
      offersService.threeForThePriceOfTwo(3, BigDecimal(20)) mustEqual BigDecimal(40)
    }

    "give one item for free when four of the same item" in {
      offersService.threeForThePriceOfTwo(4, BigDecimal(20)) mustEqual BigDecimal(60)
    }

    "give two items for free when six of the same item" in {
      offersService.threeForThePriceOfTwo(6, BigDecimal(20)) mustEqual BigDecimal(80)
    }

    "give no items for free when one of the same item" in {
      offersService.threeForThePriceOfTwo(1, BigDecimal(20)) mustEqual BigDecimal(20)
    }
  }
}
