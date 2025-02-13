# frozen_string_literal: true

# RooMarkets module
module RooMarkets
  VERSION = "0.1.0"

  VALID_MARKETS = %w[gb fr ie].freeze

  def self.valid_market?(market)
    VALID_MARKETS.include? market
  end
end
