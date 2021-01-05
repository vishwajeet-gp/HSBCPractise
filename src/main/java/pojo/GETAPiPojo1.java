package pojo;

public class GETAPiPojo1
{
	
	private int Latest;
	private String Symbols;
	private String Base;
	private String SymbolBase;
	
	public GETAPiPojo1(int Latest, String Symbols, String Base,String SymbolBase) {
		this.Latest = Latest;
		this.Symbols = Symbols;
		this.Base = Base;
		this.SymbolBase=SymbolBase;
	}

	public int getLatest() {
		return Latest;
	}

	public void setLatest(int Latest) {
		this.Latest = Latest;
	}

	public String getSymbols() {
		return Symbols;
	}

	public void setSymbols(String Symbols) {
		this.Symbols = Symbols;
	}

	public String getBase() {
		return Base;
	}

	public void setBase(String Base) {
		this.Base = Base;
	}

	public String getSymbolBase() {
		return SymbolBase;
	}

	public void setSymbolBase(String SymbolBase) {
		this.SymbolBase = SymbolBase;
	}

	@Override
	public String toString() {
		return "GETAPiPojo1 [Latest=" + this.Latest + ", Symbols=" + this.Symbols + ", Base=" + this.Base + ", SymbolBase="+this.SymbolBase+"]";
	}
	
	
	
}
