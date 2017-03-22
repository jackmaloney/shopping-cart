package main.domain

abstract class Item {

  def name: String
  def price: BigDecimal

}

case object Apple extends Item {

  override def name = "Apple"

  override def price = BigDecimal("0.60")

}

case object Orange extends Item {

  override def name = "Orange"

  override def price = BigDecimal("0.25")

}
