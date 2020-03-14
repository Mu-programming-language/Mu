package category;

public enum Category {
	ANALYSIS,
	ALGEBRA,
	SET_THEORY,
	GEOMETRY,
	STATISTIC_AND_PROBABILITY;

	public String toString() {
		return this == Category.ANALYSIS ? "analysis" : this == Category.ALGEBRA ? "algebra" : this == Category.SET_THEORY ? "set theory" : this == Category.GEOMETRY ? "geometry" : "statistic and probability";
	}
}
