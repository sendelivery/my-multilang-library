package markets_test

import (
	"testing"

	markets "github.com/sendelivery/my-multilang-library/go"
)

func Test_IsMarketValid(t *testing.T) {
	data := []struct {
		market   string
		expected bool
	}{
		{"gb", true},
		{"fr", true},
		{"ie", true},
		{"us", false},
		{"de", false},
		{"hk", false},
	}

	for _, d := range data {
		t.Run(d.market, func(t *testing.T) {
			if got := markets.IsMarketValid(d.market); got != d.expected {
				t.Errorf("IsMarketValid(%s) = %v, expected %v", d.market, got, d.expected)
			}
		})
	}
}
