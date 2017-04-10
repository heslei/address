package api.address;

import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import dao.AddressDao;
import model.Address;

@Path("/address")
public class AddressApi {

	AddressDao dao = new AddressDao();

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public void createAddress(Address address) {

		dao.createAddress(address);
	}

}
