package com.jdbc.project;

import java.sql.*;
import java.util.Scanner;


public class JDBC {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String jdbcURL="jdbc:postgresql://localhost:5432/record";
        String username="postgres";
        String password="postgres";

        try{
            Connection connection = DriverManager.getConnection(jdbcURL,username,password);

            System.out.println("connected to postgresql sever");

//           select code

            Statement stmt = connection.createStatement();

            ResultSet rs = stmt.executeQuery("select * from students order by sid");


            System.out.println("StuId"+" "+"StuName"+" "+"Studept");
            while (rs.next())
            {
                String n = rs.getString("sid");
                String nm = rs.getString("name");
                int s = rs.getInt("dept_no");
                System.out.println( n + " " + nm + " " + s);
            }


//            insert code
            System.out.println("Now at the time of insert.");
            String q1="insert into students (sid,name,dept_no) values(?,?,?)";
            PreparedStatement pstmt1=connection.prepareStatement(q1);

            System.out.println("Enter the sid?");
            int ssid=sc.nextInt();
            System.out.println("Enter the student name:");
            String sname=sc.next();
            System.out.println("Enter the department:");
            int sdept=sc.nextInt();

            pstmt1.setInt(1,ssid);
            pstmt1.setString(2,sname);
            pstmt1.setInt(3,sdept);





//            Delete code
            System.out.println("Now at the time of delete.");
            String q2="delete from students where sid=?";
            PreparedStatement pstmt2=connection.prepareStatement(q2);

            System.out.println("Enter the student id you want to delete them:");
            int sssid=sc.nextInt();

            pstmt2.setInt(1,sssid);




//            Update code
            System.out.println("Now at the time of update...");
            String q3="update students set dept_no=? where sid=?";
            PreparedStatement pstmt3=connection.prepareStatement(q3);

            System.out.println("Enter the student id where you want to update the student department:");
            int ssssid=sc.nextInt();
            System.out.println("Enter the student department:");
            int ssdept=sc.nextInt();

            pstmt3.setInt(1,ssdept);
            pstmt3.setInt(2,ssssid);

            pstmt1.executeUpdate();
            pstmt2.executeUpdate();
            pstmt3.executeUpdate();

            System.out.println("Successfully inserted");
            System.out.println("Successfully delete");
            System.out.println("Successfully update");

//            Select code

            System.out.println("This is the table retrevial.");
            Statement stmt2=connection.createStatement();
            rs = stmt2.executeQuery("select * from students order by sid");

            System.out.println("StuId"+" "+"StuName"+" "+"Studept");
            while (rs.next())
            {
                String n = rs.getString("sid");
                String nm = rs.getString("name");
                int s = rs.getInt("dept_no");
                System.out.println( n + " " + nm + " " + s);
            }



            connection.close();
        }
        catch (SQLException e){
            System.out.println("Error in connecting to postgresql server");
            e.printStackTrace();
        }
    }
}

