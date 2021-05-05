
public class Exercise8_9 {

	public static void main(String[] args) {
		throw new UnsupportedFuctionException("�������� �ʴ� ����Դϴ�.", 100);
	}

}

class UnsupportedFuctionException extends RuntimeException {
	
	private final int ERR_CODE;
	
	UnsupportedFuctionException(String msg) {
		this(msg, 100);
	}
	
	
	UnsupportedFuctionException(String msg, int errcode) {
		super(msg);
		ERR_CODE=errcode;
	}
	
	public int getErrorCode() {
		return ERR_CODE;
	}
	
	public String getMessage() {
		return "["+getErrorCode()+"]"+super.getMessage();
	}
}
