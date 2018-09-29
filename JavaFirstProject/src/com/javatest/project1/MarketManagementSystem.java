package com.javatest.project1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.Scanner;

import javax.swing.text.AsyncBoxView.ChildLocator;

public class MarketManagementSystem {

	// 管理员登录
	public static void Login() throws AWTException {
		Scanner input = new Scanner(System.in); // 从键盘输入
		// 创建一个长度为6的数组存放用户名和密码
		// 再创建一个长度为6的数组用来接收从键盘输入的用户名和密码
		String yourusername;
		int yourpassword;
		String username = "123456";
		int password = 123456;

		System.out.println("********************************");
		System.out.println();

		System.out.println("请输入用户名: ");
		yourusername = input.next();

		System.out.println("请输入密码: ");
		yourpassword = input.nextInt();

		if (username.equals(yourusername) == true && password == yourpassword) {
			System.out.println("登录成功!");
			Simulation();
			Choice();
		} else {
			System.out.println("登录失败!请重新输入!");
			Simulation();
			Login();
		}
	}

	// 模拟鼠标清屏
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

	// 跳转功能面板
	public static void Choice() throws AWTException {

		System.out.println("1.商品管理");
		System.out.println("2.用户管理");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		if (num == 1) {
			Goodsmanage();
			Simulation();

		} else if (num == 2) {
			Usermanage();
			Simulation();
		} else {
			System.out.println("请重新输入!");
			Simulation();
			Choice();
		}

	}

	// 商品管理
	public static void Goodsmanage() throws AWTException {
		System.out.println("1.1 添加商品");
		System.out.println("1.2 删除商品");
		System.out.println("1.3 修改商品");
		System.out.println("1.4 查看商品");
		System.out.println("输入1.0返回上一层!");
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
			System.out.println("请重新输入!");
			Simulation();
			Goodsmanage();
		}
	}

	// 添加商品
	public static void Addgoods() throws AWTException {
		int len = 100; // 定义数组长度
		String[] name = new String[len]; // 商品名称
		int[] amount = new int[len]; // 商品数量
		double[] price = new double[len]; // 商品价格
		int[] stock = new int[len]; // 商品库存
		int[] number = new int[len]; // 商品编号

		boolean key = true;
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < len; i++) {

			System.out.println("商品名称: 商品数量: 商品价格: 商品库存: 商品编号: 是否结束(true/false): ");
			name[i] = input.next(); // 商品名称
			amount[i] = input.nextInt(); // 商品数量
			price[i] = input.nextDouble(); // 商品价格
			stock[i] = input.nextInt(); // 商品库存
			number[i] = input.nextInt(); // 商品编号
			key = input.nextBoolean(); // 判断是否结束输入
			if (key != true) {
				break;
			}

		}
		Goodsmanage();

	}

	// 删除商品
	public static void Deletegoods() {

	}


	// 修改商品
	public static void Revisegoods() {
		System.out.println("修改商品");
	}

	// 查看商品
	public static void Checkgoods() {

	}

	// 用户管理
	public static void Usermanage() {

	}

	// 删除数组元素
	public int[] delete(int index, int array[]) {
		// 数组的删除其实就是覆盖前一位
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
