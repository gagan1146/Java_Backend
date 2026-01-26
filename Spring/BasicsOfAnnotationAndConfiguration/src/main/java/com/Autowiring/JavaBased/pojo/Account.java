package com.Autowiring.JavaBased.pojo;

import java.util.List;

public class Account {
    private String branchName;
    private String branchCode;
    private String branchAddress;
    private List<Users> users;

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public void setBranchAddress(String branchAddress) {
        this.branchAddress = branchAddress;
    }

    public void setUsers(List<Users> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Account{" +
                "branchName='" + branchName + '\'' +
                ", branchCode='" + branchCode + '\'' +
                ", branchAddress='" + branchAddress + '\'' +
                ", users=" + users +
                '}';
    }
}
