package br.edu.ifpb.report.controller;

import br.edu.ifpb.report.database.DatabaseConnector;
import br.edu.ifpb.report.database.PostgreSQLDatabaseConnector;

public class ExpenseReport extends Report{

    DatabaseConnector createDatabaseConnector() {
        return new PostgreSQLDatabaseConnector();
    }

    public void executeQuery() {
        System.out.println("Executing Postgres Query...");
        String query = "SELECT * FROM expenses";
        createDatabaseConnector().executeQuery(query);
    }

    public void convertToFile() {
        System.out.println("Converting To XLS...");
    }

}
