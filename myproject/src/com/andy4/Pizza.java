package com.andy4;

import java.util.InputMismatchException;

public class Pizza {
	
	public Pizza(String answer) throws PizzaException{
	
		int piece;
		try {
			piece = Integer.parseInt(answer);
			}catch (NumberFormatException  e) {
               System.out.println("�п�J�Ʀr");
				throw new PizzaException(answer);
               
			}
		if(piece==0) {
			System.out.println("�A�T�w���n��?");
		}if(piece==8 || piece==12 || piece==16) {
			System.out.println("���¿���");
		}if(piece<0 || piece>15) {
			System.out.println("�W�X�d��");
		}if(piece>0 && piece<8||piece>8 && piece<12||piece>12 && piece<16) {
		System.out.println("�ƶq���~");
		}
		
		}
			
		
}
	
	

