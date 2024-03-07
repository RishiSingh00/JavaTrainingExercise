package com.web;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
    @RequestMapping("/login")
    public ModelAndView login(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView mv = new ModelAndView("index");
        try {
            // Load MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establish connection
            String username = request.getParameter("userName");
            if (username.length() == 0 || username.equals("")) {
                mv.addObject("message", "Invalid Username");
                return mv;
            }
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hughes", "root", "rishi2001");
            PreparedStatement pstmt = con.prepareStatement("SELECT name, age, password FROM user WHERE username = ?");
            pstmt.setString(1, username);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                String password = request.getParameter("password");

                if (password.equals(rs.getString("password"))) {
                    mv = new ModelAndView("successPage");
                    mv.addObject("message", "Welcome " + rs.getString("name") + " '" + rs.getInt("age"));
                } else {
                    mv.addObject("message", "Invalid Password");
                }
            } else {
                mv.addObject("message", "Invalid Username");
            }

        } catch (Exception e) {
            e.printStackTrace();
            mv.addObject("message", "Error occurred. Please try again.");
        }
        return mv;
    }
}
