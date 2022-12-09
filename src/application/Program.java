package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;


public class Program {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		List<Employee> employees = new ArrayList<>();
		
		System.out.print("Entre com a quantidade de funcionários: ");
		int n = input.nextInt();
		
		for(int i = 1; i <= n; ++i) {
			System.out.println("Dados do #"+i+" funcionário:");
			System.out.println("Funcionário terceirizado (y/n)? ");
			String aux = input.next();
			System.out.print("Nome: ");
			String name = input.next();
			System.out.print("Horas: ");
			int hours = input.nextInt();
			System.out.print("Valor por hora: ");
			double valuePerHours = input.nextDouble();
			
			if(aux.equals("y")) {
				System.out.print("Valor adicional: ");
				double additionalCharge = input.nextDouble();
				
				Employee employee = new OutsourcedEmployee(name, hours, valuePerHours, additionalCharge);
				employees.add(employee);
			}else {
				Employee employee = new Employee(name, hours, valuePerHours);
				employees.add(employee);
			}
		}
		
		System.out.println("PAGAMENTOS:");
		
		for(Employee employee : employees) {
			System.out.println(employee);
		}
		
		
		input.close();
	}

}
