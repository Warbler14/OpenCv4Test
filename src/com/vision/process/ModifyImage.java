package com.vision.process;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

public class ModifyImage {

	public void modifyImageTest(final String location) {
		// prepare to convert a RGB image in gray scale
		System.out.print("Convert the image at " + location + " in gray scale... ");

		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
		
		// get the jpeg image from the internal resource folder
		Mat image = Imgcodecs.imread(location);
		
		// convert the image in gray scale
		Imgproc.cvtColor(image, image, Imgproc.COLOR_BGR2GRAY);
		
		// write the new image on disk
		Imgcodecs.imwrite(getModifiyFileName(location, "gray"), image);
		System.out.println("Done!");
		
	}
	
	private static String getModifiyFileName(final String filePath, final String addName) {
		Integer extendIndex = filePath.lastIndexOf(".");
		StringBuilder builder = new StringBuilder( filePath.substring(0, extendIndex));
		builder.append("-").append(addName).append(".").append(filePath.substring(extendIndex + 1, filePath.length()));
		return builder.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(getModifiyFileName("test.jpg", "white"));
	}
}

