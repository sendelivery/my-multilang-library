package markets

func IsMarketValid(m string) bool {
	switch m {
	case "gb", "fr", "ie":
		return true
	default:
		return false
	}
}
