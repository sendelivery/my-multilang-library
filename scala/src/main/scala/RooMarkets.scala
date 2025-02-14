object RooMarkets {
  def isMarketValid(market: String): Boolean = {
    market match {
      case "gb" => true
      case "fr" => true
      case "ie" => true
      case "hk" => true
      case _    => false
    }
  }
}
