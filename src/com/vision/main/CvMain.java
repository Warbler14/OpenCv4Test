package com.vision.main;

import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;

import com.vision.process.CompareImages;
import com.vision.process.ModifyImage;

public class CvMain {
	public static void main(String[] args) {
		
//		cvTest();		
//		modifyImage();
//		matchTest();
//		featureTest();
		histogramTest();
		
	}

	public static String getResourceFilePath(final String fileName) {
		return System.getProperty("user.dir")  + "\\resources\\" + fileName;
	}
	
	public static void cvTest() {
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
		Mat mat = Mat.eye(3, 3, CvType.CV_8UC1);
		System.out.println("mat = " + mat.dump());
	}
	
	public static void modifyImage() {
		System.out.println(getResourceFilePath("test01.jpg"));
		new ModifyImage().modifyImageTest(getResourceFilePath("test01.jpg"));
//		new ModifyImage().modifyImageTest(getResourceFilePath("test01.png"));
	}
	
//	public static void matchTest() {
//		System.out.println("=========Maching test jpg=========");
//		new CompareImages().compareImages(getResourceFilePath("test01.jpg"), getResourceFilePath("test01.jpg"));
//		new CompareImages().compareImages(getResourceFilePath("test01.jpg"), getResourceFilePath("test02.jpg"));
//		new CompareImages().compareImages(getResourceFilePath("test01.jpg"), getResourceFilePath("test01-gray.jpg"));
//		new CompareImages().compareImages(getResourceFilePath("test01.jpg"), getResourceFilePath("test01-damaged.jpg"));
//		
//		System.out.println("=========Maching test png=========");
//		new CompareImages().compareImages(getResourceFilePath("test01.png"), getResourceFilePath("test01.png"));
//		new CompareImages().compareImages(getResourceFilePath("test01.png"), getResourceFilePath("test01-gray.png"));
//		new CompareImages().compareImages(getResourceFilePath("test01.png"), getResourceFilePath("test01-damaged.png"));
//	}
	
	public static void histogramTest() {
		System.out.println("=========Maching histogram test jpg=========");
		new CompareImages().compareHistogram(getResourceFilePath("test01.jpg"), getResourceFilePath("test01.jpg"));
		new CompareImages().compareHistogram(getResourceFilePath("test01.jpg"), getResourceFilePath("test02.jpg"));
		new CompareImages().compareHistogram(getResourceFilePath("test01.jpg"), getResourceFilePath("test01-damaged.jpg"));
		
		System.out.println("=========Maching histogram test png=========");
		new CompareImages().compareHistogram(getResourceFilePath("test01.png"), getResourceFilePath("test01.png"));
		new CompareImages().compareHistogram(getResourceFilePath("test01.png"), getResourceFilePath("test02.png"));
		new CompareImages().compareHistogram(getResourceFilePath("test01.png"), getResourceFilePath("test01-damaged.png"));
	}
	
	public static void featureTest() {
		System.out.println("=========Maching histogram test jpg=========");
		new CompareImages().compareFeatcure(getResourceFilePath("test01.jpg"), getResourceFilePath("test01.jpg"));
		new CompareImages().compareFeatcure(getResourceFilePath("test01.jpg"), getResourceFilePath("test02.jpg"));
		new CompareImages().compareFeatcure(getResourceFilePath("test01.jpg"), getResourceFilePath("test01-damaged.jpg"));
		
		System.out.println("=========Maching histogram test png=========");
		new CompareImages().compareFeatcure(getResourceFilePath("test01.png"), getResourceFilePath("test01.png"));
		new CompareImages().compareFeatcure(getResourceFilePath("test01.png"), getResourceFilePath("test02.png"));
		new CompareImages().compareFeatcure(getResourceFilePath("test01.png"), getResourceFilePath("test01-damaged.png"));
	}
}
