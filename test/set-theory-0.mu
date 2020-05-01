set theory;

statement:
	let A = {x ∈ R | x ≤ 0},
	let B = {x ∈ R | x ≥ 0},
	let C = {x ∈ R | x > 0};

ask:
	#1: show A ∩ B = {0};

proof:
	#1:
		∀ x ∈ A ∩ B, x ∈ A ∧ x ∈ B
		=> ∀ x ∈ A ∩ B, x ≥ 0 ∧ x ≤ 0
		=> ∀ x ∈ A ∩ B, x ∈ {0};
		thus A ∩ B ⊂ {0};

		∀ x ∈ {0}, x = 0
		=> ∀ x ∈ {0}, x ≥ 0 ∧ x ≤ 0
		=> ∀ x ∈ {0}, x ∈ A ∧ x ∈ B
		=> ∀ x ∈ {0}, x ∈ A ∩ B;
		thus {0} ⊂ A ∩ B;

		thus A ∩ B = {0};
		done;
