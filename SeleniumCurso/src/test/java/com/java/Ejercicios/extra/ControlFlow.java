package com.java.Ejercicios.extra;

public class ControlFlow {

	public static void main(String[] args) {

		System.out.println(getBucketCount(2.75, 3.25, 2.5, 1));
		System.out.println(getBucketCount(7.25, 4.3, 2.35));
		System.out.println(getBucketCount(-3.26, 0.75));

	}

	// With extraBuckets = 0 allowed

	public static int getBucketCount(double width, double height, double areaPerBucket, double extraBuckets) {
		double buckets = 0.0;

		if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
			return -1;
		} else {
			double area = width * height;
			buckets = Math.ceil((area / areaPerBucket) - extraBuckets); // Metodo que redondea un valor doble hacia
																		// arriba
			return (int) buckets;
		}
	}

	// With extraBuckets = 0 not allowed - overloaded

	public static int getBucketCount(double width, double height, double areaPerBucket) {
		double buckets = 0.0;

		if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
			return -1;
		} else {
			double area = width * height;
			buckets = Math.ceil((area / areaPerBucket));
			return (int) buckets;
		}
	}

	// With area - overloaded

	public static int getBucketCount(double area, double areaPerBucket) {
		double buckets = 0.0;

		if (area <= 0 || areaPerBucket <= 0) {
			return -1;
		} else {
			buckets = Math.ceil((area / areaPerBucket));
			return (int) buckets;
		}
	}
}
