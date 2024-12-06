import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FileSystemSimulator fs = new FileSystemSimulator();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Digite o comando (createFile, deleteFile, createDir, deleteDir, listDir, showJournal, exit):");
            String command = scanner.nextLine();

            switch (command) {
                case "createFile":
                    System.out.println("Digite o diretório e o nome do arquivo (separados por espaço):");
                    String dirAndFile = scanner.nextLine();
                    String[] parts1 = dirAndFile.split("\\s+", 2);
                    if (parts1.length == 2) {
                        fs.createFile(parts1[0], parts1[1]);
                    } else {
                        System.out.println("Entrada inválida. Por favor, forneça o diretório e o nome do arquivo.");
                    }
                    break;

                case "deleteFile":
                    System.out.println("Digite o diretório e o nome do arquivo (separados por espaço):");
                    dirAndFile = scanner.nextLine();
                    String[] parts2 = dirAndFile.split("\\s+", 2);
                    if (parts2.length == 2) {
                        fs.deleteFile(parts2[0], parts2[1]);
                    } else {
                        System.out.println("Entrada inválida. Por favor, forneça o diretório e o nome do arquivo.");
                    }
                    break;

                case "createDir":
                    System.out.println("Digite o diretório pai e o nome do novo diretório (separados por espaço):");
                    String dirAndNewDir = scanner.nextLine();
                    String[] parts3 = dirAndNewDir.split("\\s+", 2);
                    if (parts3.length == 2) {
                        fs.createDirectory(parts3[0], parts3[1]);
                    } else if (parts3.length == 1) {
                        fs.createDirectory("root", parts3[0]); 
                    } else {
                        System.out.println("Entrada inválida. Por favor, forneça um nome válido para o diretório.");
                    }
                    break;

                case "deleteDir":
                    System.out.println("Digite o diretório pai e o nome do diretório (separados por espaço):");
                    String dirAndDeleteDir = scanner.nextLine();
                    String[] parts4 = dirAndDeleteDir.split("\\s+", 2);
                    if (parts4.length == 2) {
                        fs.deleteDirectory(parts4[0], parts4[1]);
                    } else {
                        System.out.println("Entrada inválida. Por favor, forneça o diretório pai e o nome do diretório.");
                    }
                    break;

                case "listDir":
                    System.out.println("Digite o nome do diretório:");
                    String dirName = scanner.nextLine().trim();
                    fs.listDirectory(dirName);
                    break;

                case "showJournal":
                    fs.showJournal();
                    break;

                case "exit":
                    running = false;
                    break;

                default:
                    System.out.println("Comando inválido.");
            }
        }

        scanner.close(); 
    }
}
