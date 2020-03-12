// input1


question:
	#1: "show A = B",
	#2: "show A ≠ C",
	#3: "show E ⊂ F";
proof:
	#1:
		let x ∈ A,
		=> x < 0,
		=> x ∈ B,
		=> A ⊂ B,

		let x ∈ B,
		=> x < 0,
		=> x ∈ A,
		=> B ⊂ B,

		=> A = B,
		eureka;
	#2:
		-1 ∈ A ∧ -1 ∉ B,
		=> A ≠ C,
		eureka;
	#3:
		let x ∈ E,
		=> x = 5,
		=> x > 0 ∧ x < 10,
		=> E ⊂ F,
		eureka;
