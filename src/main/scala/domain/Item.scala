package main.domain

import domain.{BuyOneGetOneFreeOffer, Offer, ThreeForPriceOfTwoOffer}

abstract class Item {

  def name: String
  def price: BigDecimal
  def offers: List[Offer]
}

//In real life the prices would be read in from config
case object Apple extends Item {

  override def name = "Apple"

  override def price = BigDecimal(0.60)

  override def offers = List(BuyOneGetOneFreeOffer)
}

case object Orange extends Item {

  override def name = "Orange"

  override def price = BigDecimal(0.25)

  override def offers = List(ThreeForPriceOfTwoOffer)
}
