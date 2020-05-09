package db;
/**
 * Classe pra capturar a execption e repassar a mesma 
 * @author miguel
 *
 */
public class DbException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public DbException(String msg) {
		super(msg);
	}
}
