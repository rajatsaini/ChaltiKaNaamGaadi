package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Train;

public class TrainDAO {
	
	public Train findTrain(int trainNo) throws TrainNotFoundException{
		Train trainObject = null;
		Connection conn = null;
		try {
			String sql = "SELECT train_No,train_Name,source,destination,ticket_price from "
					+ "trains where train_no=?";
			
			conn = util.DBUtil.getConnection();
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, trainNo);
			ResultSet result = ps.executeQuery();
			if(result.next()){
				trainObject = new Train(result.getInt(1),result.getString(2),result.getString(3),
					result.getString(4),result.getDouble(5));
			}
			else throw new TrainNotFoundException();
			
		} catch (SQLException e) {
			System.out.println("Class not found or SQLException !!");
		}
		finally{
			try {
				conn.close();
			} catch (SQLException e) {
				System.out.println("Connection Couldn't be closed !!");
			}
		}
		return trainObject;
		
	}

	public List<Train> findTrainsWithSource(String aTrainSource) throws TrainNotFoundException{
		
		String trainSource = String.valueOf(aTrainSource.charAt(0)).toUpperCase() + aTrainSource.substring(1).toLowerCase();
		
		List<Train> trains = new ArrayList<>();
		Connection conn = null;
		Train trainObject = null; 
		try {
			String sql = "SELECT train_No,train_Name,source,destination,ticket_price from "
					+ "trains where source=?";
			
			conn = util.DBUtil.getConnection();
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, trainSource);
			ResultSet result = ps.executeQuery();

			while(result.next()){
				trainObject = new Train(result.getInt(1),result.getString(2),result.getString(3),
					result.getString(4),result.getDouble(5));
				trains.add(trainObject);
			}
			if(trains.size()==0){
				throw new TrainNotFoundException();
			}
			else{
				return trains;
			}
			
		} catch (SQLException e) {
			System.out.println("Class not found or SQLException !!");
		}
		finally{
			try {
				conn.close();
			} catch (SQLException e) {
				System.out.println("Connection Couldn't be closed !!");
			}
		}
		return trains;
	}
	
	public List<Train> findTrainWithDestination(String destinationSource) throws TrainNotFoundException{
		
			String destination = String.valueOf(destinationSource.charAt(0)).toUpperCase() + destinationSource.substring(1).toLowerCase();
			System.out.println(destination);
		List<Train> trains = new ArrayList<>();
		Connection conn = null;
		Train trainObject = null; 
		try {
			String sql = "SELECT train_No,train_Name,source,destination,ticket_price from "
					+ "trains where destination=?";
			
			conn = util.DBUtil.getConnection();
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, destination);
			ResultSet result = ps.executeQuery();

			while(result.next()){
				trainObject = new Train(result.getInt(1),result.getString(2),result.getString(3),
					result.getString(4),result.getDouble(5));
				trains.add(trainObject);
			}
			if(trains.size()==0){
				throw new TrainNotFoundException();
			}
			else{
				return trains;
			}
			
		} catch (SQLException e) {
			System.out.println("Class not found or SQLException !!");
		}
		finally{
			try {
				conn.close();
			} catch (SQLException e) {
				System.out.println("Connection Couldn't be closed !!");
			}
		}
		return trains;
	}

}
