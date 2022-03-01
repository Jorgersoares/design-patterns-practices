package br.edu.ifpb;

import br.edu.ifpb.report.controller.ExpenseReport;
import br.edu.ifpb.report.controller.TaxReport;
import br.edu.ifpb.report.service.ReportService;

public class Main {

    public static void main(String[] args) {
        ReportService reportService = new ReportService();
        //Gerando relatório de Gastos
        reportService.generateReport(new ExpenseReport());
        //Gerando relatório de Impostos
        reportService.generateReport(new TaxReport());
    }

}
