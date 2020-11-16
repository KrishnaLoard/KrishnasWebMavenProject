package com.krishnasRest.MainController;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.Vector;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;
import com.krishnas.modelClasses.CustomerModel;
import com.krishnas.modelClasses.DriverManagersSQL;
import com.krishnas.modelClasses.ResponseModel;

@Path("getdatabaseoperation")
public class DatabaseOperationsRestController {

	@POST
	@Path("/getallcustomerdata")
	@Produces(MediaType.APPLICATION_JSON)
	public String getCustomerRecordsFromTable() {
		// TODO Auto-generated method stub
		try {

			ResponseModel model = new ResponseModel();

			String Select_Query = "SELECT * FROM customers";
			Connection connection = DriverManagersSQL.getDriverMangerInstance();
			PreparedStatement statement = connection.prepareStatement(Select_Query);
			// Statement statement = DriverManagersSQL.getDriverMangerInstance();
			ResultSet resultSet = statement.executeQuery(Select_Query);

			List<CustomerModel> customerModels = new Vector<CustomerModel>();
			while (resultSet.next()) {

				CustomerModel customerModel = new CustomerModel();

				int getCistomerNumber = resultSet.getInt("customerNumber");
				customerModel.setCustomerNumber(getCistomerNumber);

				String CustomerName = resultSet.getString("customerName");
				customerModel.setCustomerName(CustomerName);

				String CustomerLastname = resultSet.getString("contactLastName");
				customerModel.setContactLastname(CustomerLastname);

				String phone = resultSet.getString("phone");
				customerModel.setPhone(phone);

				String addressLine1 = resultSet.getString("addressLine1");
				customerModel.setAddressLine1(addressLine1);

				String addressLine2 = resultSet.getString("addressLine2");
				customerModel.setAddressLine2(addressLine2);

				String city = resultSet.getString("city");
				customerModel.setCity(city);

				String state = resultSet.getString("state");
				customerModel.setState(state);

				String postalCode = resultSet.getString("postalCode");
				customerModel.setPostalCode(postalCode);

				String country = resultSet.getString("country");
				customerModel.setCountry(country);

				String salesRepEmployeeNumber = resultSet.getString("salesRepEmployeeNumber");
				customerModel.setSalesRepEmployeeNumber(salesRepEmployeeNumber);

				String creditLimit = resultSet.getString("creditLimit");
				customerModel.setCreditLimit(creditLimit);

				customerModels.add(customerModel);

			}
			statement.getConnection().close();
			statement.close();

			model.setResponseCode("200");
			model.setResponseContent(customerModels);
			model.setResponseStatus("Success");

			Gson gson = new Gson();
			String JsonCovert = gson.toJson(model);
			System.out.println(JsonCovert);

			return JsonCovert;

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		ResponseModel model = new ResponseModel();
		model.setResponseCode("500");
		model.setResponseContent("Internal Server Error");
		model.setResponseContent("Check Logs for more details");
		Gson gson = new Gson();
		String JsonCovert = gson.toJson(model);
		return JsonCovert;
	}

	@POST
	@Path("/getwiththecustomerid")
	@Produces(MediaType.APPLICATION_ATOM_XML)
	public String getCustomerBynumber(@QueryParam("customerid") int Customeriid) {
		// TODO Auto-generated method stub
		try {
			// System.out.println(Customeriid);
			ResponseModel model = new ResponseModel();

			String Select_Query = "select * from customers where customerNumber=?";
			Connection connection = DriverManagersSQL.getDriverMangerInstance();
			PreparedStatement statement = connection.prepareStatement(Select_Query);
			statement.setInt(1, Customeriid);
			ResultSet resultSet = statement.executeQuery();
			List<CustomerModel> customerModels = new Vector<CustomerModel>();
			System.out.println("Id that needs to be fatched" + Customeriid);
			while (resultSet.next()) {

				CustomerModel customerModel = new CustomerModel();

				int getCistomerNumber = resultSet.getInt("customerNumber");
				// System.out.println(resultSet.getInt("customerNumber"));
				customerModel.setCustomerNumber(getCistomerNumber);

				String CustomerName = resultSet.getString("customerName");
				customerModel.setCustomerName(CustomerName);

				String CustomerLastname = resultSet.getString("contactLastName");
				customerModel.setContactLastname(CustomerLastname);

				String phone = resultSet.getString("phone");
				customerModel.setPhone(phone);

				String addressLine1 = resultSet.getString("addressLine1");
				customerModel.setAddressLine1(addressLine1);

				String addressLine2 = resultSet.getString("addressLine2");
				customerModel.setAddressLine2(addressLine2);

				String city = resultSet.getString("city");
				customerModel.setCity(city);

				String state = resultSet.getString("state");
				customerModel.setState(state);

				String postalCode = resultSet.getString("postalCode");
				customerModel.setPostalCode(postalCode);

				String country = resultSet.getString("country");
				customerModel.setCountry(country);

				String salesRepEmployeeNumber = resultSet.getString("salesRepEmployeeNumber");
				customerModel.setSalesRepEmployeeNumber(salesRepEmployeeNumber);

				String creditLimit = resultSet.getString("creditLimit");
				customerModel.setCreditLimit(creditLimit);

				customerModels.add(customerModel);

			}
			statement.getConnection().close();
			statement.close();

			model.setResponseCode("200");
			model.setResponseContent(customerModels);
			model.setResponseStatus("Success");

			Gson gson = new Gson();
			String JsonCovert = gson.toJson(model);
			System.out.println(JsonCovert);

			return JsonCovert;

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		ResponseModel model = new ResponseModel();
		model.setResponseCode("500");
		model.setResponseContent("Internal Server Error");
		model.setResponseContent("Check Logs for more details");
		Gson gson = new Gson();
		String JsonCovert = gson.toJson(model);
		return JsonCovert;
	}

	@POST
	@Path("/getpagination")
	public String getStartingandEndingPoint(@FormParam("start") int start, @FormParam("end") int end) {
		// TODO Auto-generated method stub

		try {

			ResponseModel model = new ResponseModel();
			System.out.println("Start" + start + " End" + end);
			String Select_Query = "select * from customers where customerNumber >= ? and customerNumber <= ?";
			Connection connection = DriverManagersSQL.getDriverMangerInstance();
			PreparedStatement statement = connection.prepareStatement(Select_Query);
			statement.setInt(1, start);
			statement.setInt(2, end);
			ResultSet resultSet = statement.executeQuery();
			List<CustomerModel> customerModels = new Vector<CustomerModel>();
			while (resultSet.next()) {

				CustomerModel customerModel = new CustomerModel();

				int getCistomerNumber = resultSet.getInt("customerNumber");
				// System.out.println(resultSet.getInt("customerNumber"));
				customerModel.setCustomerNumber(getCistomerNumber);

				String CustomerName = resultSet.getString("customerName");
				customerModel.setCustomerName(CustomerName);

				String CustomerLastname = resultSet.getString("contactLastName");
				customerModel.setContactLastname(CustomerLastname);

				String phone = resultSet.getString("phone");
				customerModel.setPhone(phone);

				String addressLine1 = resultSet.getString("addressLine1");
				customerModel.setAddressLine1(addressLine1);

				String addressLine2 = resultSet.getString("addressLine2");
				customerModel.setAddressLine2(addressLine2);

				String city = resultSet.getString("city");
				customerModel.setCity(city);

				String state = resultSet.getString("state");
				customerModel.setState(state);

				String postalCode = resultSet.getString("postalCode");
				customerModel.setPostalCode(postalCode);

				String country = resultSet.getString("country");
				customerModel.setCountry(country);

				String salesRepEmployeeNumber = resultSet.getString("salesRepEmployeeNumber");
				customerModel.setSalesRepEmployeeNumber(salesRepEmployeeNumber);

				String creditLimit = resultSet.getString("creditLimit");
				customerModel.setCreditLimit(creditLimit);

				customerModels.add(customerModel);

			}
			statement.getConnection().close();
			statement.close();

			model.setResponseCode("200");
			model.setResponseContent(customerModels);
			model.setResponseStatus("Success");

			Gson gson = new Gson();
			String JsonCovert = gson.toJson(model);
			System.out.println(JsonCovert);

			return JsonCovert;

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		ResponseModel model = new ResponseModel();
		model.setResponseCode("500");
		model.setResponseContent("Internal Server Error");
		model.setResponseContent("Check Logs for more details");
		Gson gson = new Gson();
		String JsonCovert = gson.toJson(model);
		return JsonCovert;
	}

}
