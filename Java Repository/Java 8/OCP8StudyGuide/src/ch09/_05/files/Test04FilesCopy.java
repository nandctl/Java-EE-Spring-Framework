package ch09._05.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Test04FilesCopy {

	public static void main(String[] args) throws IOException {

		Path path1 = Paths.get("original/folder/file.txt");

		if (!Files.exists(path1)) {
			Files.createDirectories(path1.getParent());
			Files.createFile(path1);
		}

		Path path2 = Paths.get("copied/folder/copied.txt");

		if (!Files.exists(path2)) {
			Files.createDirectories(path2.getParent());
			Files.createFile(path2);
		}

		//
		Files.copy(path1, path2, StandardCopyOption.REPLACE_EXISTING);
		//

	}
}
// Directory copies are shallow rather than deep, meaning that files and
// sub directories within the directory are not copied. To copy the contents of a
// directory, you would need to create a function to traverse the directory and
// copy each file and sub directory individually
