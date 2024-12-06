# Simulador de Sistema de Arquivos

Este projeto consiste em um simulador de sistema de arquivos desenvolvido em Java. Ele implementa funcionalidades básicas de manipulação de arquivos e diretórios, com suporte a Journaling para garantir a integridade das operações realizadas. O objetivo é oferecer uma compreensão prática do funcionamento de sistemas de arquivos, especialmente os dotados de journaling.

---

## **Introdução ao Sistema de Arquivos com Journaling**

Um sistema de arquivos é um sistema lógico utilizado por sistemas operacionais para organizar e gerenciar arquivos em dispositivos de armazenamento. Ele define como os dados são armazenados, acessados e organizados. Alguns dos sistemas de arquivos mais conhecidos incluem FAT, NTFS, APFS, HFS, EXT4, entre outros.

### **Journaling**
Journaling é um mecanismo que registra alterações feitas no sistema de arquivos em logs. Esse processo garante a integridade dos dados em caso de falhas ou interrupções inesperadas, permitindo a recuperação do estado anterior.

---

## **Arquitetura do Simulador**

### **Componentes do Simulador**

1. **`FileSystemSimulator`**: Classe principal que gerencia os comandos do sistema de arquivos. Inclui operações como criar, listar, renomear e deletar arquivos e diretórios.

2. **`Directory`**: Representa a estrutura de diretórios no sistema de arquivos. 
   - Permite que diretórios contenham arquivos e subdiretórios.
   - Gerencia listas de conteúdos internos.

3. **`FileEntry`**: Representa os arquivos no sistema. 
   - No simulador, os arquivos não possuem conteúdo, apenas o nome.

4. **`Journal`**: Implementa o mecanismo de journaling.
   - Registra logs das operações realizadas.
   - Permite a consulta do histórico de ações.

---

## **Fluxograma**

Fluxo básico de operações no simulador:

