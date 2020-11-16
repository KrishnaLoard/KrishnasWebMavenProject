package com.krishnasRest.MainController;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.google.gson.Gson;
import com.krishnas.modelClasses.ResponseModel;

@Path("sayhello")
public class RestMainController {

	@GET
	@Path("/gettemp")
	@Produces(MediaType.APPLICATION_JSON)
	public String convertCtoF() {

		try {

			Double fahrenheit;
			Double celsius = 36.8;
			fahrenheit = ((celsius * 9) / 5) + 32;

			ResponseModel model = new ResponseModel();
			String result = "@Produces(\"application/xml\") Output: \n\nC to F Converter Output: \n\n" + fahrenheit;
			model.setResponseCode("200");
			model.setResponseContent(result);
			model.setResponseStatus("Success");

			Gson gson = new Gson();
			String JsonCovert = gson.toJson(model);
			System.out.println(JsonCovert);
			// JSONObject jsonObject = new JSONObject(JsonCovert);

			return JsonCovert;

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return null;

	}

}
