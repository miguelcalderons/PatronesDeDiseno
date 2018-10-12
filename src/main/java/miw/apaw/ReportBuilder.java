package miw.apaw;

public class ReportBuilder {

    Report report;

    public ReportBuilder(String message, String id) {
        this.report = new Report(message, id);
    }

    public ReportBuilder safeLanding(Boolean safeLanding) {
        report.setSafeLanding(safeLanding);
        return this;
    }

    public Report build() {
        return report;
    }

}
