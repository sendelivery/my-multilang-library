package markets

func IsMarketValid(m string) bool {
	switch m {
	case "gb", "fr", "ie", "asdf":
		return true
	default:
		return false
	}
}
