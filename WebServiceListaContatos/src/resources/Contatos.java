package resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.json.JSONObject;


@Path("/ContatosList")
public class Contatos {
	@GET
	@Produces("application/json")
	public String getContatoList() {

		JSONObject obj = new JSONObject();
		obj.append("nome", "igor");
		return obj.toString();
	}
}
