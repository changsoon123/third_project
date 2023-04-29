package com.java.restaurant.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.java.common.DatabaseConnection;
import com.java.view.StartUI;

public class Restaurantrepository {

	private DatabaseConnection connection = DatabaseConnection.getInstance();
	
	public void searchRestaurant() {
		String sql = "SELECT * FROM Restaurant";
		
//		Connection conn = null;
//		PreparedStatement pstmt = null;
//		ResultSet rs = null; //SELECT 문에서만 사용하는 객체.
		
		
		try(Connection conn = connection.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();){
				
			int count = 0;
			while(rs.next()) {
				
				int restaurant_id = rs.getInt("restaurant_id"); //괄호 안에 컬럼명
				String restaurant_name = rs.getString("restaurant_name"); 
				String main_menu = rs.getString("main_menu"); 
				int price = rs.getInt("price");
				String  address = rs.getString("address"); 
				
				//LocalDateTime -> Timestamp: Timestamp.valueOf(LocalDateTime);
				//Timestamp -> LocalDateTime: Timestamp.toLocalDateTime();
				
				count++;
				
				System.out.printf("# 가게 id: %d\n# 가게 이름: %s\n# 가게 메뉴: %s\n# 가격: %d원\n# 가게 주소: %s\n", restaurant_id, restaurant_name, main_menu, price, address);
				System.out.println("------------------------");
				
			}
			System.out.println("조회된 행의 개수: " + count + "개");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void foodtype(int fourvalue) {
		while(true) {
			
			
			if(fourvalue==1) {
				String sql = "SELECT r.restaurant_id, r.restaurant_name, r.main_menu, r.price, r.address FROM ko_restaurant_review k LEFT JOIN Restaurant r ON k.restaurant_id = r.restaurant_id";
				
//				Connection conn = null;
//				PreparedStatement pstmt = null;
//				ResultSet rs = null; //SELECT 문에서만 사용하는 객체.
				
				
				try(Connection conn = connection.getConnection();
						PreparedStatement pstmt = conn.prepareStatement(sql);
						ResultSet rs = pstmt.executeQuery();){
						
					int count = 0;
					while(rs.next()) {
						
						int restaurant_id = rs.getInt("restaurant_id"); //괄호 안에 컬럼명
						String restaurant_name = rs.getString("restaurant_name"); 
						String main_menu = rs.getString("main_menu"); 
						int price = rs.getInt("price");
						String  address = rs.getString("address"); 
						
						//LocalDateTime -> Timestamp: Timestamp.valueOf(LocalDateTime);
						//Timestamp -> LocalDateTime: Timestamp.toLocalDateTime();
						
						count++;
						
						System.out.printf("# 가게 id: %d\n# 가게 이름: %s\n# 가게 메뉴: %s\n# 가격: %d원\n# 가게 주소: %s\n", restaurant_id, restaurant_name, main_menu, price, address);
						System.out.println("------------------------");
						
					}
					System.out.println("조회된 행의 개수: " + count + "개");
					
				} catch (SQLException e) {
					e.printStackTrace();
				}
				break;
			}
			else if(fourvalue==2) {
				String sql = "SELECT r.restaurant_id, r.restaurant_name, r.main_menu, r.price, r.address FROM ja_restaurant_review k LEFT JOIN Restaurant r ON k.restaurant_id = r.restaurant_id";
				
//				Connection conn = null;
//				PreparedStatement pstmt = null;
//				ResultSet rs = null; //SELECT 문에서만 사용하는 객체.
				
				
				try(Connection conn = connection.getConnection();
						PreparedStatement pstmt = conn.prepareStatement(sql);
						ResultSet rs = pstmt.executeQuery();){
						
					int count = 0;
					while(rs.next()) {
						
						int restaurant_id = rs.getInt("restaurant_id"); //괄호 안에 컬럼명
						String restaurant_name = rs.getString("restaurant_name"); 
						String main_menu = rs.getString("main_menu"); 
						int price = rs.getInt("price");
						String  address = rs.getString("address"); 
						
						//LocalDateTime -> Timestamp: Timestamp.valueOf(LocalDateTime);
						//Timestamp -> LocalDateTime: Timestamp.toLocalDateTime();
						
						count++;
						
						System.out.printf("# 가게 id: %d\n# 가게 이름: %s\n# 가게 메뉴: %s\n# 가격: %d원\n# 가게 주소: %s\n", restaurant_id, restaurant_name, main_menu, price, address);
						System.out.println("------------------------");
						
					}
					System.out.println("조회된 행의 개수: " + count + "개");
					
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
				break;
			}
			else if(fourvalue==3) {
				String sql = "SELECT r.restaurant_id, r.restaurant_name, r.main_menu, r.price, r.address FROM ch_restaurant_review k LEFT JOIN Restaurant r ON k.restaurant_id = r.restaurant_id";
				
//				Connection conn = null;
//				PreparedStatement pstmt = null;
//				ResultSet rs = null; //SELECT 문에서만 사용하는 객체.
				
				
				try(Connection conn = connection.getConnection();
						PreparedStatement pstmt = conn.prepareStatement(sql);
						ResultSet rs = pstmt.executeQuery();){
						
					int count = 0;
					while(rs.next()) {
						
						int restaurant_id = rs.getInt("restaurant_id"); //괄호 안에 컬럼명
						String restaurant_name = rs.getString("restaurant_name"); 
						String main_menu = rs.getString("main_menu"); 
						int price = rs.getInt("price");
						String  address = rs.getString("address"); 
						
						//LocalDateTime -> Timestamp: Timestamp.valueOf(LocalDateTime);
						//Timestamp -> LocalDateTime: Timestamp.toLocalDateTime();
						
						count++;
						
						System.out.printf("# 가게 id: %d\n# 가게 이름: %s\n# 가게 메뉴: %s\n# 가격: %d원\n# 가게 주소: %s\n", restaurant_id, restaurant_name, main_menu, price, address);
						System.out.println("------------------------");
						
					}
					System.out.println("조회된 행의 개수: " + count + "개");
					
				} catch (SQLException e) {
					e.printStackTrace();
				}
			
				
				break;
			} else if(fourvalue==4) {
				String sql = "SELECT r.restaurant_id, r.restaurant_name, r.main_menu, r.price, r.address FROM we_restaurant_review k LEFT JOIN Restaurant r ON k.restaurant_id = r.restaurant_id";
				
//				Connection conn = null;
//				PreparedStatement pstmt = null;
//				ResultSet rs = null; //SELECT 문에서만 사용하는 객체.
				
				
				try(Connection conn = connection.getConnection();
						PreparedStatement pstmt = conn.prepareStatement(sql);
						ResultSet rs = pstmt.executeQuery();){
						
					int count = 0;
					while(rs.next()) {
						
						int restaurant_id = rs.getInt("restaurant_id"); //괄호 안에 컬럼명
						String restaurant_name = rs.getString("restaurant_name"); 
						String main_menu = rs.getString("main_menu"); 
						int price = rs.getInt("price");
						String  address = rs.getString("address"); 
						
						//LocalDateTime -> Timestamp: Timestamp.valueOf(LocalDateTime);
						//Timestamp -> LocalDateTime: Timestamp.toLocalDateTime();
						
						count++;
						
						System.out.printf("# 가게 id: %d\n# 가게 이름: %s\n# 가게 메뉴: %s\n# 가격: %d원\n# 가게 주소: %s\n", restaurant_id, restaurant_name, main_menu, price, address);
						System.out.println("------------------------");
						
					}
					System.out.println("조회된 행의 개수: " + count + "개");
					
				} catch (SQLException e) {
					e.printStackTrace();
				}
			
				
				
				break;
			}
			else {
				System.out.println("메뉴를 다시 입력하세요.");
			}
			System.out.println("\n==== 계속 진행하시려면 ENTER를 누르세요====");
			StartUI.inputString();
			
			}
		
	}
	
	
}
