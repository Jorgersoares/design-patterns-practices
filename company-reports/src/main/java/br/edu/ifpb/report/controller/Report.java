package br.edu.ifpb.report.controller;

import br.edu.ifpb.report.database.DatabaseConnector;

public abstract class Report {

    public void generate() {
        createDatabaseConnection();
        executeQuery();
        convertToFile();
    }

    private void createDatabaseConnection() {
        System.out.println("Creating Database Connection...");
        DatabaseConnector connector = createDatabaseConnector();
        connector.openConnection();
    }

    abstract DatabaseConnector createDatabaseConnector();

    abstract void executeQuery();

    abstract void convertToFile();
}
