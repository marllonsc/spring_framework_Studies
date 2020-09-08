package com.msc.spring.springcore.propertyplaceholder;

public class MyDAO {
    private String dbServer;
    private String dbPort;
    private String dbUser;
    private String dbPass;

    public MyDAO(String dbServer, String dbPort, String dbUser, String dbPass) {
        this.dbServer = dbServer;
        this.dbPort = dbPort;
        this.dbUser = dbUser;
        this.dbPass = dbPass;
    }

    public void setDbServer(String dbServer) {
        this.dbServer = dbServer;
    }

    public void setDbPort(String dbPort) {
        this.dbPort = dbPort;
    }

    public void setDbUser(String dbUser) {
        this.dbUser = dbUser;
    }

    public void setDbPass(String dbPass) {
        this.dbPass = dbPass;
    }

    public String getDbServer() {
        return dbServer;
    }

    public String getDbPort() {
        return dbPort;
    }

    public String getDbUser() {
        return dbUser;
    }

    public String getDbPass() {
        return dbPass;
    }

    @Override
    public String toString() {
        return "MyDAO{" +
                "dbServer='" + dbServer + '\'' +
                ", dbPort='" + dbPort + '\'' +
                ", dbUser='" + dbUser + '\'' +
                ", dbPass='" + dbPass + '\'' +
                '}';
    }
}
