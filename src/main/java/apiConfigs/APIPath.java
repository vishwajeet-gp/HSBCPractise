package apiConfigs;

public class APIPath {
	
	public static final class apiPath{
		
		//GET Latest Date Data
		public static final String GET_LATEST_FOREIGN_EXCHANGE_RATE ="/api/latest HTTP/2";
		public static final String GET_LATEST_FOREIGN_EXCHANGE_RATE_SYMBOL="/api/latest?symbols=USD,GBP HTTP/2";
		public static final String GET_LATEST_FOREIGN_EXCHANGE_RATE_WITH_BASE ="/api/latest?base=USD HTTP/2";
		public static final String GET_LATEST_FOREIGN_EXCHANGE_RATE_SYMBOLS_WITH_BASE="/api/latest?base=USD&symbols=GBP HTTP/2";
		
		//GET Past Conversion Rate
		public static final String GET_SPECIFIC_DATE_FOREIGN_EXCHANGE_RATE="/api/2010-01-12";
		public static final String GET_SPECIFIC_DATE_FOREIGN_EXCHANGE_RATE_WITH_SYMBOL="/api/2010-01-12?symbols=USD,GBP HTTP/2";
		public static final String GET_SPECIFIC_DATE_FOREIGN_EXCHANGE_RATE_WITH_BASE="/api/2010-01-12?base=USD HTTP/2";
		public static final String GET_SPECIFIC_DATE_FOREIGN_EXCHANGE_RATE_WITH_SYMBOLS_WITH_BASE="/api/2010-01-12?base=USD&symbols=GBP HTTP/2";
		
	}
	
}
