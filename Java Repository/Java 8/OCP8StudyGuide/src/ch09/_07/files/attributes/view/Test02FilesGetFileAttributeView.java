package ch09._07.files.attributes.view;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class Test02FilesGetFileAttributeView {

	// Files.readAttributes() method is useful for reading file data, it does
	// not provide a direct mechanism for modifying file attributes. The NIO.2 API
	// provides the Files.getFileAttributeView(Path,Class<V>) method,

	public static void main(String[] args) throws IOException {
		Path dir = Paths.get("folder");

		if (!Files.exists(dir)) {
			Files.createDirectory(dir);
		}

		BasicFileAttributeView view = Files.getFileAttributeView(dir, BasicFileAttributeView.class);
		BasicFileAttributes data = view.readAttributes();

		FileTime lastModifiedTime = FileTime.fromMillis(data.lastModifiedTime().toMillis() + 10_000);
		view.setTimes(lastModifiedTime, null, null);
		// BasicFileAttributeView is used to modify a file’s set of date/time values.
	}
}

// BasicFileAttributes BasicFileAttributeView
// DosFileAttributes DosFileAttributeView
// PosixFileAttributes PosixFileAttributeView
