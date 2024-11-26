package com.stype.annotatio.pdijavaConfigApproach;

import java.util.Objects;

//no source code
public class Branch {
    private int id;
    private String ifscCode;
    private String branchName;
    private String loc;

    @Override
    public String toString() {
        return "Branch{" +
                "id=" + id +
                ", ifscCode='" + ifscCode + '\'' +
                ", branchName='" + branchName + '\'' +
                ", loc='" + loc + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Branch branch = (Branch) o;
        return id == branch.id && Objects.equals(ifscCode, branch.ifscCode) && Objects.equals(branchName, branch.branchName) && Objects.equals(loc, branch.loc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ifscCode, branchName, loc);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }
}
