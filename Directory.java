import java.util.ArrayList;
import java.util.List;

public class Directory {
    private String name;
    private List<FileEntry> files = new ArrayList<>();
    private List<Directory> subDirectories = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<FileEntry> getFiles() {
        return files;
    }

    public List<Directory> getSubDirectories() {
        return subDirectories;
    }

    public void addFile(FileEntry file) {
        files.add(file);
    }

    public void addDirectory(Directory directory) {
        subDirectories.add(directory);
    }

    public void removeFile(String fileName) {
        files.removeIf(file -> file.getName().equals(fileName));
    }

    public void removeDirectory(String dirName) {
        subDirectories.removeIf(dir -> dir.getName().equals(dirName));
    }
}
