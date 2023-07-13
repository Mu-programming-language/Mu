category set theory;

statement:
	let A = {x ∈ R | x ≤ 0},
	let B = {x ∈ R | x ≥ 0},
//	let F = {x ∈ R | x ≥ 0 ∧ x ≤ 1},
	let D = {x ∈ R | 2*x ≤ 0},
	let E,
	E = {x ∈ R | 2*x ≤ 0};
//	let E = {(x, y) ∈ R² | x² + y² = 1};

ask:
	#1: show A ≠ B,
	#2: show C ⊂ B,
	#3: show A = D;

proof:
/*	#1:
		1 ∈ B ∧ 1 ∉ A
		=> A ≠ C;
		done;
	#2:
		∀ x ∈ C, x ≥ 0 ∧ x ≤ 1
		=> ∀ x ∈ C, x ≥ 0
		=> C ⊂ B;
		done;
*/	#3:
		∀ x ∈ A, x ≤ 0
		=> ∀ x ∈ A, 2*x ≤ 0
		=> A ⊂ D;

		∀ x ∈ D, 2*x ≤ 0
		=> ∀ x ∈ D, x ≤ 0
		=> D ⊂ A;

		A ⊂ D ∧ D ⊂ A => A = D;
		done;
	#3:
		∀ x ∈ A, x ≤ 0
		<=> ∀ x ∈ D, 2*x ≤ 0
		<=> A = D;
		done;
