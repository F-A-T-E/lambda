package com.lvpf;

import java.util.concurrent.Callable;

public class LambdaTest {
	public static void main(String[] args) throws Exception {
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("running1.....");
			}
		};
		runnable.run();

		Runnable runnable1 = ()->{
			System.out.println("runnable2.....");
		};
		runnable1.run();

		Runnable runnable2 = ()-> System.out.println("runnable3.....");
		runnable2.run();

		Callable<String> c1 = new Callable() {
			@Override
			public String  call() throws Exception {
				return "lvpf";
			}
		};

		System.out.println(c1.call());

		Callable<String> c2 = ()->{return "lvpf2";};
		System.out.println(c2.call());

		Callable<String> c3 = ()->"lvpf3";
		System.out.println(c3.call());
	}
}
