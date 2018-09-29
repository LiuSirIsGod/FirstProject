package com.javatest.project1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.Scanner;

import javax.swing.text.AsyncBoxView.ChildLocator;

public class MarketManagementSystem {

	// ����Ա��¼
	public static void Login() throws AWTException {
		Scanner input = new Scanner(System.in); // �Ӽ�������
		// ����һ������Ϊ6���������û���������
		// �ٴ���һ������Ϊ6�������������մӼ���������û���������
		String yourusername;
		int yourpassword;
		String username = "123456";
		int password = 123456;

		System.out.println("********************************");
		System.out.println();

		System.out.println("�������û���: ");
		yourusername = input.next();

		System.out.println("����������: ");
		yourpassword = input.nextInt();

		if (username.equals(yourusername) == true && password == yourpassword) {
			System.out.println("��¼�ɹ�!");
			Simulation();
			Choice();
		} else {
			System.out.println("��¼ʧ��!����������!");
			Simulation();
			Login();
		}
	}

	// ģ���������
	public static void Simulation() throws AWTException {
		Robot r = new Robot();
		r.mousePress(InputEvent.BUTTON3_DOWN_MASK);
		r.mouseRelease(InputEvent.BUTTON3_MASK);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_R);
		r.keyRelease(KeyEvent.VK_R);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.delay(100);

	}

	// ��ת�������
	public static void Choice() throws AWTException {

		System.out.println("1.��Ʒ����");
		System.out.println("2.�û�����");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		if (num == 1) {
			Goodsmanage();
			Simulation();

		} else if (num == 2) {
			Usermanage();
			Simulation();
		} else {
			System.out.println("����������!");
			Simulation();
			Choice();
		}

	}

	// ��Ʒ����
	public static void Goodsmanage() throws AWTException {
		System.out.println("1.1 �����Ʒ");
		System.out.println("1.2 ɾ����Ʒ");
		System.out.println("1.3 �޸���Ʒ");
		System.out.println("1.4 �鿴��Ʒ");
		System.out.println("����1.0������һ��!");
		Scanner input = new Scanner(System.in);
		double num1 = input.nextDouble();
		if (num1 == 1.1) {
			Simulation();
			Addgoods();
		} else if (num1 == 1.2) {
			Simulation();
			Deletegoods();
		} else if (num1 == 1.3) {
			Simulation();
			Revisegoods();
		} else if (num1 == 1.4) {
			Simulation();
			Checkgoods();
		} else if (num1 == 1.0) {
			Simulation();
			Choice();
		} else {
			System.out.println("����������!");
			Simulation();
			Goodsmanage();
		}
	}

	// �����Ʒ
	public static void Addgoods() throws AWTException {
		int len = 100; // �������鳤��
		String[] name = new String[len]; // ��Ʒ����
		int[] amount = new int[len]; // ��Ʒ����
		double[] price = new double[len]; // ��Ʒ�۸�
		int[] stock = new int[len]; // ��Ʒ���
		int[] number = new int[len]; // ��Ʒ���

		boolean key = true;
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < len; i++) {

			System.out.println("��Ʒ����: ��Ʒ����: ��Ʒ�۸�: ��Ʒ���: ��Ʒ���: �Ƿ����(true/false): ");
			name[i] = input.next(); // ��Ʒ����
			amount[i] = input.nextInt(); // ��Ʒ����
			price[i] = input.nextDouble(); // ��Ʒ�۸�
			stock[i] = input.nextInt(); // ��Ʒ���
			number[i] = input.nextInt(); // ��Ʒ���
			key = input.nextBoolean(); // �ж��Ƿ��������
			if (key != true) {
				break;
			}

		}
		Goodsmanage();

	}

	// ɾ����Ʒ
	public static void Deletegoods() {

	}


	// �޸���Ʒ
	public static void Revisegoods() {
		System.out.println("�޸���Ʒ");
	}

	// �鿴��Ʒ
	public static void Checkgoods() {

	}

	// �û�����
	public static void Usermanage() {

	}

	// ɾ������Ԫ��
	public int[] delete(int index, int array[]) {
		// �����ɾ����ʵ���Ǹ���ǰһλ
		int[] arrNew = new int[array.length - 1];
		for (int i = 0; i < array.length - 1; i++) {
			if (i < index) {
				arrNew[i] = array[i];
			} else {
				arrNew[i] = array[i + 1];
			}
		}
		return arrNew;
	}
	public static void main(String[] args) throws AWTException {
		Login();

	}

}
