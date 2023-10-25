package rambdaex.ex11;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student implements Comparable<Student> {
	private String name;
	private int score;
	
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return Integer.compare(score, o.score);
	}

	
}
