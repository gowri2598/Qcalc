package com.crio.qcalc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QcalcApplication {

	public static void main(String[] args) {
		SpringApplication.run(QcalcApplication.class, args);
		System.out.println("Starting QCalc..");

		
		StandardCalculator calc = new StandardCalculator();

		calc.add(Double.MAX_VALUE, Double.MAX_VALUE);
		//calc.add(Double.MAX_VALUE, 1.0);
		//calc.subtract(-Double.MAX_VALUE, Double.MAX_VALUE);

		calc.printResult();


		//System.out.println(Double.MAX_VALUE);
		System.out.println(calc.getResult());

	}

}
