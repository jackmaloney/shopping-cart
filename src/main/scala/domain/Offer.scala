package domain

abstract class Offer {

  def name: String
}

case object BuyOneGetOneFreeOffer extends Offer {

  override def name = "BuyOneGetOneFreeOffer"
}

case object ThreeForPriceOfTwoOffer extends Offer {

  override def name = "ThreeForPriceOfTwoOffer"
}
