package com.lvpf.why2;

import com.lvpf.why.Student;

public class ScoreFilter implements StudentFilter{
	@Override
	public boolean compare(Student student) {
		return student.getScore()>75;
	}
}
