import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class RooMarketsSpec extends AnyFlatSpec with Matchers {
  "isMarketValid" should "return true for valid markets" in {
    RooMarkets.isMarketValid("gb") should be (true)
    RooMarkets.isMarketValid("fr") should be (true)
    RooMarkets.isMarketValid("ie") should be (true)
  }

  it should "return false for invalid markets" in {
    RooMarkets.isMarketValid("us") should be (false)
    RooMarkets.isMarketValid("de") should be (false)
  }
}
