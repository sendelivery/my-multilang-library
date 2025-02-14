# frozen_string_literal: true

require_relative "../lib/roo_markets"

RSpec.describe RooMarkets do
  it "has a version number" do
    expect(RooMarkets::VERSION).not_to be nil
  end

  it "is_valid_market returns true when given a valid market" do
    expect(RooMarkets.valid_market?("gb")).to eq(true)
    expect(RooMarkets.valid_market?("fr")).to eq(true)
    expect(RooMarkets.valid_market?("ie")).to eq(true)
    expect(RooMarkets.valid_market?("hk")).to eq(true)
  end

  it "is_valid_market returns false when given an invalid market" do
    expect(RooMarkets.valid_market?("de")).to eq(false)
    expect(RooMarkets.valid_market?("us")).to eq(false)
  end
end
