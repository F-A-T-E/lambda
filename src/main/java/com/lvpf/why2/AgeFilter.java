package com.lvpf.why2;

import com.lvpf.why.Student;

public class AgeFilter implements StudentFilter{
	@Override
	public boolean compare(Student student) {
		return student.getAge()>14;
	}
}
