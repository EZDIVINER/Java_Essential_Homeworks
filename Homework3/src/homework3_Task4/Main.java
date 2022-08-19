package homework3_Task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Document Worker");
        System.out.println("Free version key - 1"+"\nPro version key - 2"+ "\nExpert version - 3");
        System.out.println("Enter key of version");
        Scanner in = new Scanner(System.in);
        int userKey = in.nextInt();
        switch (userKey){
            case 1: {
                DocumentWorker documentWorker = new DocumentWorker();
                documentWorker.openDocument();
                documentWorker.editDocument();
                documentWorker.saveDocument();
                break;
            }
            case 2:{
                ProDocumentWorker proDocumentWorker = new ProDocumentWorker();
                proDocumentWorker.openDocument();
                proDocumentWorker.editDocument();
                proDocumentWorker.saveDocument();
                break;
            }
            case 3:{
                ExpertDocumentWorker expertDocumentWorker = new ExpertDocumentWorker();
                expertDocumentWorker.openDocument();
                expertDocumentWorker.editDocument();
                expertDocumentWorker.saveDocument();
                break;
            }
            default:{
                System.out.println("Error, invalid key");
            }
        }
    }
}
