package priv.design.case1;

public interface DBFactory {
    public Connection createConnect();
    public Statement createStatement();
}
