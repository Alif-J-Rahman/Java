public Class Fence {
	public String fence(int Input) {
		String answer;
		if Input == 1 {
			answer = "|"
		}else {
			fence(Input - 1)
		}
	}
}
