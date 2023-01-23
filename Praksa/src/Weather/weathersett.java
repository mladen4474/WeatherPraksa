package Weather;

public abstract class weathersett {

	protected String api;
	protected String grad;
	protected String idapi;
	protected String jedMerenja;

	public void API() {
	}

//---------------------------------------------------------------------------------------
	public weathersett(String api, String grad, String idapi, String jedMerenja) {
		super();
		this.api = api;
		this.grad = grad;
		this.idapi = idapi;
		this.jedMerenja = jedMerenja;
	}

	public weathersett() {
		super();
	}

//--------------------------------------------
	public String getApi() {
		return api;
	}

	public void setApi(String api) {
		this.api = api;
	}

	public String getGrad() {
		return grad;
	}

	public void setGrad(String grad) {
		this.grad = grad;
	}

	public String getIdapi() {
		return idapi;
	}

	public void setIdapi(String idapi) {
		this.idapi = idapi;
	}

	public String getJedMerenja() {
		return jedMerenja;
	}

	public void setJedMerenja(String jedMerenja) {
		this.jedMerenja = jedMerenja;
	}

	@Override
	public String toString() {
		return "weathersett [api=" + api + ", grad=" + grad + ", idapi=" + idapi + ", jedMerenja=" + jedMerenja + "]";
	}

}
