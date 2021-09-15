package com.lvpf.lambda;

import com.lvpf.why.Student;

@FunctionalInterface
//函数式接口
public interface StudentDao {

	void insert(Student student);
}
