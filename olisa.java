try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/train","root","");
            
            String sql = "insert into crestenow values (?,?,?,?,?,?,?)";
            
            PreparedStatement ptstmt = conn.prepareStatement(sql);
            ptstmt.setString(1, idtype.getText());
            ptstmt.setString(2, idnum.getText());
            ptstmt.setString(3, user.getText());
            ptstmt.setString(4, pass.getText());
            ptstmt.setString(5, dob.getText());
            ptstmt.setString(6, email.getText());
            ptstmt.setString(7, phone.getText());
            
            ptstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Submition Success");
            
            conn.close();