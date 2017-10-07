package factory;
// singleton pattern
public class CreditInfoService {
	private static CreditInfoService creditInfoService;

	public static CreditInfoService getService() {
		return creditInfoService;
	}
}
