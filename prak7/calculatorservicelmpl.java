package service.impl;
import service.calculatorservice;
public class calculator servicelmpl implements calculator {
	@override
	public integer tambah(int bil1, int bil2) {
		return bil1 + bil2;
	}
	@override
	public integer kurang (in bil1, int bil2)	{
		return bil1 - bil2;
	}
	@override
	public integer kali (int bil1, int bil2) {
		return bil1 * bil2;
	}
	@override
	public integer bagi (int bil1, int bil2) {
		return bil1 / bil2;
	}