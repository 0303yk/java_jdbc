package com.oracle.jdbctest;

import java.util.Date;

public class businessman {
    int empno;
    String ename;
    String job;
    int mgr;
    Date hiredate;
    int sal;
    int comm;
    int deptno;

    public businessman(int empno, String ename, String job, int mgr, Date hiredate, int sal, int comm, int deptno) {
        this.empno = empno;
        this.ename = ename;
        this.job = job;
        this.mgr = mgr;
        this.hiredate = hiredate;
        this.sal = sal;
        this.comm = comm;
        this.deptno = deptno;
    }

    @Override
    public String toString() {
        return "businessman{" +
                "empno=" + empno +
                ", ename='" + ename + '\'' +
                ", job='" + job + '\'' +
                ", mgr=" + mgr +
                ", hiredate=" + hiredate +
                ", sal=" + sal +
                ", comm=" + comm +
                ", deptno=" + deptno +
                '}';
    }
}
