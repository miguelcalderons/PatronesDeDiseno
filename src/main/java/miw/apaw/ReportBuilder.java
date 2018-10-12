package miw.apaw;

public class ReportBuilder {

    Report report;

    public ReportBuilder(String Message, String Id) {
        this.report = new Report(Message, Id);
    }

    public ReportBuilder SafeLanding(Boolean safeLanding) {
        report.setSafeLanding(safeLanding);
        return this;
    }

    public Report build() {
        return report;
    }

}
