package chapter10._09.questions;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Q2 {

	public static void main(String[] args) {
		Path aPath = Paths.get("/OCPJP/programs/../NIO2/src/./SubPath.java");
		// /OCJP/NIO2/src/SubPath.java
		aPath = aPath.normalize();
		System.out.println(aPath);
		System.out.println(aPath.subpath(2, 3));
	}
}
