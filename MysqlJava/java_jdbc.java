	public static void main(String[] args) throws Exception {
		
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://你的IP:23306/template?useUnicode=true", "root", "sql2008");
		
		for (int i = 0; i < 100; i++) {
			PreparedStatement pr = null;
			ResultSet res = null;
			try {
				 pr = conn.prepareStatement("select count(*) from sys_user");
				 res = pr.executeQuery();
				if(res.next()) {
					System.out.println(new Date().toLocaleString() + "->" + res.getInt(1));
				}
			} catch (Exception e) {
				e.printStackTrace();
				res.close();
				pr.close();
			}
			
			Thread.sleep(25000);
		}
		
		conn.close();
	}





