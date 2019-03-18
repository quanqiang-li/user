package vo;

/**
 * 用户,数据展示对象
 * 
 * @author aisino
 *
 */
public class UserVO {

	public static final Integer CODE_SUCCESS = 0;
	public static final Integer CODE_ERROR = 1;
	/**
	 * 状态码
	 */
	private Integer code;
	/**
	 * 用户token
	 */
	private String token;

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	@Override
	public String toString() {
		return super.toString() + "注册的状态码" + code;
	}
}
