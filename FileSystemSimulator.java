import java.util.Scanner;

public class FileSystemSimulator {
    private Directory root = new Directory("root");
    private Journal journal = new Journal();

    public void createFile(String dirName, String fileName) {
        Directory dir = findDirectory(root, dirName);
        if (dir != null) {
            dir.addFile(new FileEntry(fileName));
            journal.addLog("Arquivo Criado: " + dirName + "/" + fileName);
        } else {
            System.out.println("Diretorio não encontrado!!");
        }
    }

    public void deleteFile(String dirName, String fileName) {
        Directory dir = findDirectory(root, dirName);
        if (dir != null) {
            dir.removeFile(fileName);
            journal.addLog("Arquivo deletado: " + dirName + "/" + fileName);
        } else {
            System.out.println("Diretorio não encontrado!!");
        }
    }

    public void createDirectory(String parentDir, String dirName) {
        Directory dir = findDirectory(root, parentDir);
        if (dir != null) {
            dir.addDirectory(new Directory(dirName));
            journal.addLog("Diretorio deletado: " + parentDir + "/" + dirName);
        } else {
            System.out.println("Diretorio pai não encontrado.");
        }
    }

    public void deleteDirectory(String parentDir, String dirName) {
        Directory dir = findDirectory(root, parentDir);
        if (dir != null) {
            dir.removeDirectory(dirName);
            journal.addLog("Diretório deletado: " + parentDir + "/" + dirName);
        } else {
            System.out.println("Diretorio pai não encontrado.");
        }
    }

    public void listDirectory(String dirName) {
        Directory dir = findDirectory(root, dirName);
        if (dir != null) {
            System.out.println("Contents of directory: " + dirName);
            for (FileEntry file : dir.getFiles()) {
                System.out.println("File: " + file.getName());
            }
            for (Directory subDir : dir.getSubDirectories()) {
                System.out.println("Directory: " + subDir.getName());
            }
        } else {
            System.out.println("Diretorio não encontrado");
        }
    }

    private Directory findDirectory(Directory current, String name) {
        if (current.getName().equals(name)) {
            return current;
        }
        for (Directory subDir : current.getSubDirectories()) {
            Directory result = findDirectory(subDir, name);
            if (result != null) {
                return result;
            }
        }
        return null;
    }

    public void showJournal() {
        journal.showLogs();
    }
}
