package com.wealth.certificate.dumps_1z0_809.question107;

class ImageScanner implements AutoCloseable {

	public void close() throws Exception {
		System.out.println("Scanner closed.");
	}

	public void scanImage() throws Exception {
		System.out.println("Scan.");
		throw new Exception("Unable to scan.");
	}

}

class ImagePrinter implements AutoCloseable {

	public void close() throws Exception {
		System.out.println("Printer closed.");
	}

	public void printImage() {
		System.out.println("Print.");
	}

}

public class Question107 {

	public static void main(String[] args) {
		try (ImageScanner ir = new ImageScanner(); ImagePrinter iw = new ImagePrinter()) {	// close Right to Left
			ir.scanImage();
			iw.printImage();
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}
	}

}
